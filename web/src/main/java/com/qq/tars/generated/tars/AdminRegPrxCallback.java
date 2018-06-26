// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

import com.qq.tars.rpc.protocol.tars.support.TarsAbstractCallback;

/**
 * admin 管理接口
 */
public abstract class AdminRegPrxCallback extends TarsAbstractCallback {

	public abstract void callback_addTaskReq(int ret);

	public abstract void callback_getTaskRsp(int ret, TaskRsp taskRsp);

	public abstract void callback_getTaskHistory(int ret, java.util.List<TaskRsp> taskRsps);

	public abstract void callback_setTaskItemInfo(int ret);

	public abstract void callback_getAllApplicationNames(java.util.List<String> ret, String result);

	public abstract void callback_getAllNodeNames(java.util.List<String> ret, String result);

	public abstract void callback_pingNode(boolean ret, String result);

	public abstract void callback_getNodeVesion(int ret, String version, String result);

	public abstract void callback_shutdownNode(int ret, String result);

	public abstract void callback_getAllServerIds(java.util.List<java.util.List<String>> ret, String result);

	public abstract void callback_getServerState(int ret, ServerStateDesc state, String result);

	public abstract void callback_getGroupId(int ret, int groupId, String result);

	public abstract void callback_startServer(int ret, String result);

	public abstract void callback_stopServer(int ret, String result);

	public abstract void callback_restartServer(int ret, String result);

	public abstract void callback_notifyServer(int ret, String result);

	public abstract void callback_undeploy(int ret, String log);

	public abstract void callback_batchPatch(int ret, String result);

	public abstract void callback_updatePatchLog(int ret);

	public abstract void callback_getPatchPercent(int ret, PatchInfo tPatchInfo);

	public abstract void callback_loadServer(int ret, String result);

	public abstract void callback_getProfileTemplate(int ret, String profileTemplate, String resultDesc);

	public abstract void callback_getServerProfileTemplate(int ret, String profileTemplate, String resultDesc);

	public abstract void callback_getClientIp(int ret, String sClientIp);

}
