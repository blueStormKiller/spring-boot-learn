package constants;

public interface LDCSConstants {
	/**
	 * 登录后存到session中的标识
	 */
	String LOGIN_COMMAND = "loginCommand";

	/**
	 * 系统名称
	 */
	static final String SYSTEM_NAME = "ldcs";

	String SPLIT_STR = ",";
	String SPLIT_STR_2 = ";";
	String SEMICOLON_STR = ";";
	// PRD秘钥
	String KEYPRD_3DES = "SE1OUlZTQTA=";
	// sit秘钥
	String KEYSIT_3DES = "NzBZVFNGNlI=";
	// pre秘钥
	String KEYPRE_3DES = "NUxQVFU1TUU=";

	/**
	 * 用户的默认密码Xc935268
	 **/
	String DEFAULT_LOGIN_MI_MA = "Xc935268";

	/**
	 * 箱码包装商品类别
	 */
	String PACKAGE_ORDER_CATE_61 = "61";
	String PACKAGE_ORDER_CATE_62 = "62";
	String PACKAGE_ORDER_CATE_63 = "63";
	String PACKAGE_ORDER_CATE_71 = "71";
	String PACKAGE_ORDER_CATE_72 = "72";
	Integer INT_MINUS_1 = -1;
	Integer NUM_0 = 0;
	Integer NUM_1 = 1;
	Integer NUM_2 = 2;
	Integer NUM_3 = 3;
	Integer NUM_4 = 4;
	Integer NUM_5 = 5;
	Integer NUM_6 = 6;
	Integer NUM_7 = 7;
	Integer NUM_8 = 8;
	Integer NUM_9 = 9;
	Integer NUM_10 = 10;
	Integer NUM_11 = 11;
	Integer NUM_12 = 12;
	Integer NUM_13 = 13;
	Integer NUM_14 = 14;
	Integer NUM_15 = 15;
	Integer NUM_16 = 16;
	Integer NUM_17 = 17;
	Integer NUM_18 = 18;
	Integer NUM_19 = 19;
	Integer NUM_20 = 20;
	Integer NUM_30 = 30;

	Long LONG_999 = 999L;
	long LONG_60 = 60L;
	long LONG_1000 = 1000L;
	/**
	 * 0L
	 */
	long LONG_0 = 0L;
	/**
	 * 1L
	 */
	long LONG_1 = 1L;

	/**
	 * 更新标识
	 */
	String UPDATE_SIGN_M = "M";

	/**
	 * 作业状态编码-1045
	 */
	String OPERATION_STATE_1045 = "1045";

	/**
	 * 作业状态描述-1045
	 */
	String OPERATION_STATE_DESC_1045 = "轻泡货扫描";

	/**
	 * 作业状态编码-1090
	 */
	String OPERATION_STATE_1090 = "1090";

	/**
	 * 作业状态描述-1090
	 */
	String OPERATION_STATE_DESC_1090 = "发件";

	/**
	 * 作业状态编码-1091
	 */
	String OPERATION_STATE_1091 = "1091";

	/**
	 * 作业状态描述-1091
	 */
	String OPERATION_STATE_DESC_1091 = "发包";

	/**
	 * 作业状态编码-1101
	 */
	String OPERATION_STATE_1101 = "1101";

	/**
	 * 作业状态描述-1101
	 */
	String OPERATION_STATE_DESC_1101 = "销单完成";

	/**
	 * 作业状态编码-1111
	 */
	String OPERATION_STATE_1111 = "1111";

	/**
	 * 作业状态描述-1111
	 */
	String OPERATION_STATE_DESC_1111 = "揽件完成";

	/**
	 * 作业状态编码-1121
	 */
	String OPERATION_STATE_1121 = "1121";

	/**
	 * 作业状态描述-1121
	 */
	String OPERATION_STATE_DESC_1121 = "返货完成";

	/**
	 * 作业状态编码-1124
	 */
	String OPERATION_STATE_1124 = "1124";

	/**
	 * 作业状态描述-1124
	 */
	String OPERATION_STATE_DESC_1124 = "分拨返货";

	/**
	 * 订单类型
	 */
	String ORDER_TYPE_ZCDD = "ZCDD";
	String ORDER_TYPE_ZCEX = "ZCEX";
	String ADDITION_TYPE_A013 = "A013";
	String ADDITION_TYPE_A014 = "A014";
	String ADDITION_TYPE_A017 = "A017";
	String LOS_ORDER_TYPE_B014 = "B014";

	/**
	 * 交货单附加类型-A153
	 */
	String ORDER_ADDITIONAL_TYPE_A153 = "A153";

	/**
	 * 交货单附加类型-A156
	 */
	String ORDER_ADDITIONAL_TYPE_A156 = "A156";

	/**
	 * 订单变更码
	 */
	String ORDER_CHANGE_CODE_Z4 = "Z4";
	/**
	 * 箱码状态
	 */
	String BOX_STATUS_0020 = "0020";
	String BOX_STATUS_0035 = "0035";
	String DRIFTING_STATUS_302 = "302";
	String STRING_301 = "301";
	/**
	 * 分隔符
	 */
	String SPLIT_COMMA = ",";
	String SPLIT_CROSS = "-";
	String SPLIT_WELL = "#";
	String SPLIT_SPACE = " ";
	String SPLIT_PIPE = "|";
	/**
	 * 配载路由标识
	 */
	String SHEET_ROUTES_LOAD = "0";
	String SHEET_ROUTES_UNLOAD = "1";
	/**
	 * 班车线路类型
	 */
	String BUS_LINE_TYPE_X = "X";
	String BUS_LINE_TYPE_L = "L";
	/**
	 * 运单前缀
	 */
	String PREFIX_22 = "22";
	String PREFIX_66 = "66";
	String PREFIX_3361 = "3361";
	String PREFIX_TT = "TT";
	String PREFIX_TT66 = "TT66";
	String PREFIX_TT77 = "TT77";
	String PREFIX_TT88 = "TT88";
	String PREFIX_TT99 = "TT99";
	/**
	 * 功能名称
	 */
	String MERGE_SHIPMENT_DISPATCH = "融合发件";
	/**
	 * 到件上一站默认值无
	 */
	String STR_NONE = "00000";
	/**
	 * 默认系统名
	 */
	String STR_LDCS = "LDCS";

	/**
	 * LSQ默认系统名
	 */
	String STR_LSQ = "LSQ";
	/**
	 * 字符串字母
	 */
	String STR_A = "A";
	String STR_B = "B";
	String STR_C = "C";
	String STR_D = "D";
	String STR_E = "E";
	String STR_R = "R";
	String STR_S = "S";
	String STR_X = "X";
	String STR_Y = "Y";
	String STR_T = "T";
	String STR_U = "U";
	String STR_K_UPCASE = "K";
	String STR_K_LOWCASE = "k";
	String SHIPMENTNO_STR = "shipmentNo";
	/**
	 * 字符串数字
	 */
	String EMPTY = "";
	String NULL = "null";
	String STR_0 = "0";
	String STR_1 = "1";
	String STR_ZERO_ONE = "01";
	String STR_2 = "2";
	String STR_3 = "3";
	String STR_4 = "4";
	String STR_5 = "5";
	String STR_6 = "6";
	String STR_7 = "7";
	String STR_8 = "8";
	String STR_9 = "9";
	String STR_10 = "10";
	String STR_40 = "40";
	String STR_00 = "00";
	String STR_01 = "01";
	String STR_02 = "02";
	String STR_03 = "03";
	String STR_04 = "04";
	String STR_05 = "05";
	String STR_06 = "06";
	String STR_07 = "07";
	String STR_08 = "08";
	String STR_09 = "09";
	String STR_13 = "13";
	String STR_30 = "30";
	String STR_50 = "50";
	String STR_0_18 = "0.18";
	String STR_60 = "60";
	String STR_61 = "61";
	String STR_62 = "62";
	String STR_71 = "71";
	String STR_72 = "72";
	String FINAL_UUID = "36995c55f11a4eab90572107e8aeaa65";
	String STR_14 = "14";
	String STR_304 = "304";
	String STR_305 = "305";
	String STR_8000 = "8000";
	String SITE_LO47 = "L047";
	String STR_999 = "999";
	String STR_001 = "001";
	String STR_100 = "100";
	String STR_99 = "99";
	String STR_200 = "200";
	String STR_500 = "500";
	//环保袋
	String STR_HB01 = "HB01";
	//小周转箱
	String STR_LX02 = "LX02";
	//大周转箱
	String STR_TC01 = "TC01";

	/**
	 * 分拨计件扫描员岗位
	 */
	String STR_A01 = "A01";

	/**
	 * 外围系统名称常量
	 */
	String STR_LOBA = "LOBA";
	String STR_EDSS = "EDSS";
	String STR_LOWER_EDSS = "edss";
	String STR_SST = "SST";
	String STR_JWMS = "JWMS";
	String STR_PUSS = "PUSS";
	String STR_LSP = "LSP";
	String STR_SITE = "site";
	String STR_DESC = "siteDesc";
	/**
	 * 外发LOBA监控打点
	 */
	String TL028 = "TL028";
	String TL029 = "TL029";
	String MSG_LUL_SEND_LOBA = "装卸货记录外发";
	/**
	 * 装卸货记录外发BI
	 */
	String TL030 = "TL030";
	String MSG_LUL_SEND_LODCS = "装卸货记录外发BI";
	/**
	 * 1.装卸货记录外发BI
	 */
	String LOAD_UNLOAD_LOG_BI = "loadUnloadLogBi";

	/**
	 * 2.装卸货记录外发LOBA
	 */
	String LOAD_UNLOAD_LOG_LOBA = "loadUnloadLogLoba";

	/**
	 * 3.装运箱码与交货单对应关系外发BI
	 */
	String SHIPMENT_DELIVERY_RELATION_BI = "ldcsShipmentDeliveryRelationBi";

	/**
	 * 4.箱码操作记录外发BI
	 */
	String OPERATION_INFO_BI = "operationInfoBi";

	/**
	 * 5.箱码状态外发PUSS
	 */
	String BOX_STATUS_SEND_PUSS = "boxStatusSendPuss";

	/**
	 * 6.漂流箱状态外发PUSS
	 */
	String DRIFTING_STATUS_SEND_PUSS = "driftingStatusSendPuss";

	/**
	 * 7.承载单元外发lwms
	 */
	String BEARING_UNIT_SEND_LWMS = "bearingUnitSendLwms";

	/**
	 * 8.作业状态外发LSQ
	 */
	String OPERATION_STATE_TEMP_LSQ = "operationStateTempLsq";

	/**
	 * 9.先发车后发件外发
	 */
	String BEFORE_LOADSCAN_SEND = "beforeLoadScanSend";

	/**
	 * 10.作业状态外发LSQ 1070
	 */
	String OPERATION_STATE_TEMP_LSQ_1070 = "operationStateTempLsq1070";

	/**
	 * 11.作业状态外发LSQ 1045
	 */
	String OPERATION_STATE_TEMP_LSQ_1045 = "operationStateTempLsq1045";

	/**
	 * 12.作业状态外发LSQ 1092
	 */
	String OPERATION_STATE_TEMP_LSQ_1092 = "operationStateTempLsq1092";

	/**
	 * 13.作业状态外发LSQ 1111
	 */
	String OPERATION_STATE_TEMP_LSQ_1111 = "operationStateTempLsq1111";

	/**
	 * 14.作业状态外发LSQ 1111 家乐福
	 */
	String OPERATION_STATE_TEMP_LSQ_JIA_1111 = "operationStateTempLsqJia1111";

	/**
	 * 箱码抬头
	 */
	String BOX_HEAD_INFO = "boxHeadInfo";

	/**
	 * 箱码行项目
	 */
	String BOX_ITEM_INFO = "ttBoxItemInfo";
	/**
	 * 交货单抬头
	 */
	String ORDER_HEAD_INFO = "orderHeaderInfo";

	/**
	 * boolean类型字符串常量
	 */
	String TRUE = "true";
	String FALSE = "false";
	String SUCCESS_CODE = "R0000";

	/**
	 * 天天包号状态订单前缀
	 */
	String MXTT = "MXTT";
	/**
	 * TEST
	 */
	String TEST = "TEST";
	/**
	 * WLTEST
	 */
	String WLTEST = "WLTEST";

	/**
	 * 默认交货单行项目
	 */
	String DEFAULT_ITEM = "000010";

	/**
	 * 装卸车车辆状态和装车包裹下发WINDQ主题
	 */
	String TRUCKOPERATION_STATUS_WINDQ_TOPIC = "portal_truckOperationStatusAndDetails_Topic";

	/**
	 * 计划作业总量监控池WINDQ主题
	 */
	String TASK_PLAN_TOTAL_VOLUME_ALARM_TOPIC = "Portal_taskPlanTotalVolumeAlarm_topic";

	/**
	 * 到件监控池
	 */
	String PORTAL_RDC_UNLOAD_ALARM_TOPIC = "Portal_rdcUnloadAlarm_topic";

	String RDC_CLEAR_ALARM_POOL_UNLOAD = "01";
	String RDC_CLEAR_ALARM_POOL_SHENDSHIP = "02";
	String RDC_CLEAR_ALARM_POOL_BOTH = "03";


	/**
	 * RDC订阅者
	 */
	String RDC_ALARM_SUBSCRIBER = "RDC_ADMIN";

	/**
	 * int 数字
	 */
	int INT_0 = 0;
	int INT_1 = 1;
	int INT_MINUS2 = -2;
	int INT_2 = 2;
	int INT_3 = 3;
	int INT_4 = 4;
	int INT_5 = 5;
	int INT_6 = 6;
	int INT_7 = 7;
	int INT_MINUS7 = -7;
	int INT_8 = 8;
	int INT_9 = 9;
	int INT_10 = 10;
	int INT_11 = 11;
	int INT_12 = 12;
	int INT_13 = 13;
	int INT_14 = 14;
	int INT_15 = 15;
	int INT_16 = 16;
	int INT_17 = 17;
	int INT_18 = 18;
	int INT_19 = 19;
	int INT_20 = 20;
	int INT_25 = 25;
	int INT_28 = 28;
	int INT_MINUS3 = -3;
	int INT_MINUS5 = -5;
	int INT_MINUS26 = -26;
	int INT_MINUS27 = -27;
	int INT_MINUS30 = -30;
	int INT_100 = 100;
	int INT_1000 = 1000;
	int INT_3600 = 3600;


	//报文外发处理标识
	String SAVE_FLAG = "S";
	String UPDATE_FLAG = "U";
	String DELETE_FLAG = "D";

	//cs端调用标识
	String CS_TYPE = "CS";
	//RF端调用标识
	String RF_TYPE = "RF";
	//WCS端调用标识
	String WCS_TYPE = "WCS";

	//菜鸟淘宝标识
	String TB_TYPE = "TB";

	//小组计件 分组起始
	String STR_GROUP = "100000001";
	String VOLUME = "volume";

	//离线或者在线到件分货区不是末站DC的都记录 JT01  20190916 add by 王斌
	String DISPATCH_AREA_JT01 = "JT01";

	/**
	 * 接口返回结果编码
	 */
	String RETURN_CODE = "returnCode";

	/**
	 * 接口返回结果描述
	 */
	String RETURN_MSG = "returnMsg";

	/**
	 * 接口返回结果描述2
	 */
	String ERROR_MSG = "errorMsg";

	/**
	 * 接口返回数据
	 */
	String RETURN_DATA = "returnData";

	/**
	 * 包装商品类别
	 */
	String PACKAGE_ORDER_TYPE_HB01 = "HB01";
	/**
	 * 车辆状态与装卸货明细外发开始
	 */
	String STRING_TL026 = "TL026";

	/**
	 * 车辆状态与装卸货明细外发结束
	 */
	String STRING_TL027 = "TL027";

	/**
	 * 外发portal的动作
	 */
	String ACTION_SAVE = "save";
	String ACTION_UPDATE = "update";
	String ACTION_DELETE = "delete";
	String ACTION_DELETE_ALL = "deleteAll";
	String ACTION_SAVE_OR_UPDATE = "saveOrUpdate";
	/**
	 * 布尔类型
	 */
	Boolean BOOL_TRUE = true;
	Boolean BOOL_FALSE = false;


	/**
	 * 人员操作日志的操作种类
	 */
	String USER_OPERATE_CS_CALIBRATE = "1";
	/**
	 * 人员操作日志的操作种类分拣计划配置类型
	 */
	String USER_OPERATE_SORT_PLAN = "2";

	/**
	 * 20200217发布前新增  附加字段家乐福A153
	 */
	String REVERSE_INFO = "A153";
	/**
	 * 20200217发布前新增  附加字段家乐福A153
	 */
	String REVERSE_FLAG = "J";

	/**
	 * 一号工程整车入站缓存过期时间配置
	 */
	String LDCS_TRUCK_AUTOSCAN_EXPIRE = "ldcs.truckautoscan.expire";


	/**
	 * 一号工程装运、站点汇总重量缓存过期时间配置
	 */
	String LDCS_SHIPMRNT_SITE_WEIGHT_EXPIRE = "ldcs.shipmentsite.totalweight.expire";

	/**
	 * 在线发件缓存表箱码维度重复校验开关
	 * ldcs.shipmentdispatchcacheinfo.boxroutecheck
	 */
	String SHIPMENT_DISPATCH_CACHEINFO_BOXROUTECHECK = "ldcs.shipmentdispatchcacheinfo.boxroutecheck";
	/**
	 * 一号工程离线到件异常描述
	 */
	String UNLOAD_DATA_HANDLE_FAIL_MSG = "卸货数据处理失败";

	/**
	 * 包裹路由缓存失效时间
	 */
	String BOX_AND_ROAD_POINTS_EXPIRE = "ldcs.boxandroadpoints.cache.expire";

	/**
	 * 装卸货明细外发（LOBA、LODCS）切换枚举值（0,1,2）
	 * 默认：2
	 */
	String LOAD_UNLOAD_DETAILS_ENUMS = "ldcs.loadunloaddetails.enums";

	/**
	 * 模板类别JPT
	 */
	String DEVICE_JPT = "JPT";

	/**
	 * 装卸车车辆状态和装车包裹下发报文条目数上限
	 */
	String TRUCKOPERATION_MSG_MAX = "truck.send.tms";
	/**
	 * 车辆操作状态和装车包裹数据下发接口切换开关（默认true:新接口 false:老接口）
	 */
	String TRUCKOPERATION_STATUS_DETAILS_SWITCH = "ldcs.truckOperationStatusAndDetails.switch";
	/**
	 * 车辆操作状态和装车包裹数据下发系统（新接口）
	 */
	String TRUCKOPERATION_STATUS_DETAILS_SUBSCRIBERS_NEW = "ldcs.truckOperationStatusAndDetails.subscribers.new";
	/**
	 * 车辆操作状态和装车包裹数据下发系统默认值（新接口）
	 * SST,LODCS,JWMS
	 */
	String TRUCKOPERATION_STATUS_DETAILS_SUBSCRIBERS_NEW_DEFAULT = "SST,LODCS,JWMS";
	/**
	 * 车辆操作状态和装车包裹数据下发系统（老接口）
	 */
	String TRUCKOPERATION_STATUS_DETAILS_SUBSCRIBERS_OLD = "ldcs.truckOperationStatusAndDetails.subscribers.old";
	/**
	 * 车辆操作状态和装车包裹数据下发系统默认值（老接口）
	 * edss
	 */
	String TRUCKOPERATION_STATUS_DETAILS_SUBSCRIBERS_OLD_DEFAULT = "edss";

	/**
	 * LOS交接信息接口接口描述
	 */
	String LSP_OPERATION_DETAIL_RSF_DESC = "LOS交接信息接口";

	/**
	 * 汉字常量
	 */
	String MIN_CHN = "分";
	String HOUR_CHN = "小时";

	/**
	 * 接口返回成功编码
	 */
	String PORTAL_SUCCESS_CODE = "00001";

	/**
	 * 接口返回失败编码
	 */
	String PORTAL_FAIL_CODE = "00002";

	/**
	 * 接口返回异常编码
	 */
	String PORTAL_EXCEPTION_CODE = "00003";

	/**
	 * 接口返回重复记录(改inSn已经调用用，重复记录，可以认为成功)
	 */
	String PORTAL_DUPLICATE_CODE = "00004";

	/**
	 * 接口调用异常
	 */
	String INVOKE_ERROR = "接口调用异常";

	/**
	 * 接口调用成功
	 */
	String INVOKE_SUCC = "接口调用成功";

	//L000 站点
	String L000_SITE = "L000";

	/**
	 * LDCS内存初始化分页查询条数
	 */
	String LDCS_INITIAL_PAGE_SIZE = "ldcs.initial.pagesize";

	/**
	 * 发件监控池
	 */
	String PORTAL_RDC_SHIPMENT_DISPATCH_ALARM_TOPIC = "Portal_rdcShipmentDispatchAlarm_topic";

	/**
	 * ApiRemoteMapService
	 */
	String RSF_API_STANDARD_INTERFACE_CONTRACT = "com.suning.api.rsf.service.ApiRemoteMapService";


	/**
	 * 发件池bean
	 */
	String SHIPMENT_DISPATCH_ALARM_HANDLE = "shipmentDispatchAlarmHandle";

	/**
	 * 到件池bean
	 */
	String UNLOAD_POOL_ALARM_HANDLE = "unloadPoolAlarmHandle";


	/**
	 * 计划作业总量监控池
	 */
	String TASK_PLAN_TOTAL_VOLUME_ALARM_HANDLER = "taskPlanTotalVolumeAlarmHandler";


	/**
	 * 撤销发件功能
	 */
	String CANCEL_LOAD_ALARM_HANDLE = "cancelLoadAlarmHandle";
}
