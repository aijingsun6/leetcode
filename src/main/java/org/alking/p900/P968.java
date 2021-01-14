package org.alking.p900;

import org.alking.common.TreeNode;

public class P968 {

    public static final int STATUS_NONE = 0;
    public static final int STATUS_INSTALL = 1;
    public static final int STATUS_MONITOR = 2;
    public static final int STATUS_UN_MONITOR = 3;

    public int minCameraCover(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        sum = 0;
        int status = cameraStatus(root);
        if (status == STATUS_UN_MONITOR) {
            return sum + 1;
        }
        return sum;
    }

    int sum = 0;

    private int cameraStatus(TreeNode node) {
        if (node.left == null && node.right == null) {
            // 叶子节点，不安装，也没有被监控
            return STATUS_UN_MONITOR;
        }
        int leftStatus = STATUS_NONE;
        if (node.left != null) {
            leftStatus = cameraStatus(node.left);
        }

        int rightStatus = STATUS_NONE;
        if (node.right != null) {
            rightStatus = cameraStatus(node.right);
        }


        if (leftStatus == STATUS_UN_MONITOR || rightStatus == STATUS_UN_MONITOR) {
            // 两儿子如果有一个没有被监控，那么辛苦父亲装一个摄像头
            sum += 1;
            return STATUS_INSTALL;
        }

        if (leftStatus == STATUS_INSTALL || rightStatus == STATUS_INSTALL) {
            // 儿子有一个装了，那么自己不用装了
            return STATUS_MONITOR;
        }

        return STATUS_UN_MONITOR;

    }


}
