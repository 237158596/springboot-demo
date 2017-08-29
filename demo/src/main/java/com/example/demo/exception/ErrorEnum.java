package com.example.demo.exception;


/**
 * Created by fuhong on 15/8/17.
 */
public enum ErrorEnum implements BaseError {

    /**
     * 公共异常，10开头
     */
    SYS_ERROR("100000", "Hi，此处遇到问题，请联系Helpdesk处理,截图哦"),
    FAILURE_NOTICE("100004", "短信发送失败"),
    INVALID_PARAMTER("100001", "非法参数"),
    MISS_VERSION("100002", "版本号信息错误"),
    PARSE_PACKETS_EXCEPTION("100003", "解析报文异常"),
    PARSE_FILE_EXCEPTION("100004", "解析文件异常"),
    NET_EXCEPTION("100005", "网络异常"),
    WORKFLOW_EXCEPTION("100006", "工作流异常"),
    SSO_TOKEN_ERROR("100007", "请求头中无token信息"),
    NODATA_ERROR("100008", "数据异常"),
    WORKFLOW_DATA_EXCEPTION("100009", "工作流数据异常"),
    WORKFLOW_FORWARD_EXCEPTION("100021", "工作流推进异常"),
    NOT_PRIVILEGE("100010", "抱歉，您无权限访问该功能"),
    SQL_ERROR("100011", "数据库抽风"),
    JSON_ERROR("100012", "数据格式转换异常"),
    CONTACT_VALID_ERROR("100013", "家庭联系人、其它联系人和工作证明人,每个都必须填写一条"),
    HRSYS_DATA_EXCEPTION("100014", "人事系统数据异常"),
    ID_CARD_FORMAT_ERROR("100016", "身份证号格式非法"),
    VALUE_TO_LONG("100017", "字段输入值太长,无法保存或修改"),
    CHECK_NODATA("100018", "查询结束，无结果"),
    CC_OC_PARAM_ERROR("100019", "CC或OC码为空,请重新选择"),
    EXIST_UNANSWERED_QUESTION("100020", "此件存在拨打问题未回答情况,无法核实"),
    VERSION_EXCEPTION("100021", "保存失败,请重新打开当前页面"),
    NO_ACCESS_AUTHORITY("100022", "该用户网络无权限访问审批系统,如不是非法操作,请联系管理员进行权限配置"),
    COMP_TYPE_ERROR("100023", "单位性质必须填写"),
    TEL_CONFIG_ERROR("100024", "问题库未配置,请联系审批部相关管理人员进行配置"),
    START_WORKFLOW_ERROR("100025", "启动工作流失败"),
    CONNECT_TIMEOUT_EXCEPTION("100026", "连接第三方接口超时"),
    READ_TIMEOUT_EXCEPTION("100027", "第三方接口读取超时"),
    THRID_REQUEST_EXCEPTION("100028", "请求第三方接口调用异常"),
    THRID_RESPONSE_STATUS_EXCEPTION("100029", "请求第三方接口返回状态码异常"),
    REPEAT_DATA("100030", "数据库中存在重复的数据"),
    OFFLINE_JINJIAN_CONFIG("100031","线下渠道进件规则配置异常"),
    OFFLINE_REAPPR_JINJIAN_CONFIG("100031","线下渠道终审进件规则配置异常"),


    FIRSTAPPR_APPLYCODE_NULL("130101", "初审提交申请编号为空，请检查!"),
    FIRSTAPPR_CUSTOMERBALANCE_UPDATE_ERROR("130102", "客户收入信息更新异常!"),
    FIRSTAPPR_CUSTOMERBASE_UPDATE_ERROR("130103", "客户基本信息更新异常!"),
    FIRSTAPPR_CUSTOMERASSETS_UPDATE_ERROR("130104", "客户资产信息更新异常!"),
    FIRSTAPPR_CUSTOMERBUSIOWNER_UPDATE_ERROR("130105", "客户单位经验信息更新异常!"),
    FIRSTAPPR_CUSTOMERCONTACTS_UPDATE_ERROR("130106", "客户联系人信息更新异常!"),
    FIRSTAPPR_APPLYINFO_UPDATE_ERROR("130107", "客户申请信息更新异常!"),
    FIRSTAPPR_CUSTOMEREMP_UPDATE_ERROR("130108", "客户单位基本信息更新异常!"),
    FIRSTAPPR_SAVE_ERROR("130109", "初审注记区信息保存异常!"),
    FIRSTAPPR_CALLHIS_UPDATE_ERROR("130110", "拨打电话数据更新异常!"),

    COPY_FIRST_OPINION_ERROR("130111", "拷贝初审意见数据异常!"),
    COPY_FINAL_OPINION_ERROR("130112", "拷贝终审意见数据异常!"),

    FINALAPPR_SAVE_ERROR("140001", "终审信息保存异常!"),

    ILLEGAL_ASSIGN_NODE("150001","此节点无法进行人员任务分配操作!" ),

    CREDIT_DATA_ERROR("160001", "请求征信平台数据处理异常!"),

    /**
     * 合同平台异常,  17开头
     */
    DEL_CONTRACT_ERROR("170001", "删除合同平台合同异常"),

    /**
     * 工作流相关异常  ,18开头
     */
    WORKFLOW_ERROR("180001", "工作流异常"),

    /**
     * 接入权限系统 , 20开头
     */
    LOGIN_ERROR("200001", "登录出错"),
    OLD_PASS_ERROR("200002", "原密码错误"),
    USER_NOT_EXSIT("200003", "用户不存在"),
    PASS_NOT_EQUALS("200004", "两次密码输入不一致"),

    /**
     * 用户,40开头
     */
    MISMATCHED_AUTHCODE("400001", "验证码不匹配"),
    MISMATCHING_IDCODE("400002", "原密码不匹配"),
    MIS_ACCOUNT("400003", "账户不存在"),
    NOT_LOGIN("400004", "当前没有登录，请登录"),
    EXISTED_ACCOUNT("400005", "账户已存在，请登录"),
    ERROR_ACCOUNT("400006", "账户或密码不匹配"),
    EXISTS_LOGIN("400007", "此账号已在其它设备登录"),
    MISS_PASSWORD("400009", "密码为空，请重新输入"),
    INVALID_APPLYCODE("400010", "申请编号生成失败"),
    FAIL_SALE("400011", "保存失败"),
    EXISTED_VISITTIME("400012", "已记录上门时间则告知电销不能取消"),
    LOGIN_OVERDUE("400013", "登录已过期,请重新登录"),
    FAILURE_QUERY("400014", "查询失败"),
    USER_NOT_EMAIL("400015","当前登陆用户无邮箱信息"),
    USER_WITHOUT_TEL("400016","当前用户无电话信息"),
    EMPTY_OR_WRONG_CAPTCHA("400017","验证码未发送或已过期"),
    LOAD_USER_INFO_ERROR("400018","获取登录用户信息异常"),

    /**
     * 问题库 50开头
     */
    PATH_EXIST("500001", "编号已存在,请重新输入唯一编号"),

    /**
     * 重审  60开头
     */
    REAPPR_OVER_TIMES("600001", "重审次数超过限额上线"),


    /** 流水信息,70开头 */

    /**
     * 自动征信1 80开头
     */
    NETWORK_CHECK_ERROR("800001", "网查异常"),
    ID_CHECK_ERROR("800002", "身份校验接口调用异常"),

    /**
     * 定制化错误code 900000
     */
    IMAGE_NOT_UPLOAD_COMPLETE("900000", "影像上传不全"),
    CONTRACT_SIGN_FAIL("900001", "合同签约失败"),
    QUERY_LOGGIN_USER_ERROR("900002", "获取登录用户信息异常"),
    BLACK_HIT("900005", "此用户命中黑名单,不能进件"),
    IDENTITY_NOT_MATCH("900006", "此用户信息身份证与姓名不匹配!"),
    FUNDING_SUBMIT_FAIL("900007", "放款提交失败!"),
    CANCEL_FUND_FAIL("900008", "取消放款失败!"),
    CLICK_VALIDATE_BUTTON_BEFORE("900009", "请先点击校验2按钮"),
    LEGAL_PERSON_STATUS_NOTIFY("900010", "直销、网销信薪贷且无社保客户,请判定是否在一年内吊销,是则拒绝.其他客户无需判定吊销情形."),
    CHECK_LEGAL_PERSON_INFO("900010", "请核实客户及其配偶的法人信息"),
    REJECT_NOT_AUTO_QUERY("900011", "校验2结果为拒绝,不做自动化查询"),

    /**
     * 群组管理错误 110000
     */
    GROUP_CODE_EXIST("110001", "组代码已存在"),
    GROUP_NAME_EXIST("110002", "组名称已存在"),


    /**
     * 外部接口 120000
     */
    BLACK_EXCEPTION("120001", "请求黑名单校验异常"),

    SIMPLE_CREDIT_PDF_0("0", "不存在该客户简版征信数据"),
    SIMPLE_CREDIT_PDF_1("1", "下载完成"),
    SIMPLE_CREDIT_PDF_2("2", "客户未通过微信端注册，或者获取其征信报告失败"),
    SIMPLE_CREDIT_PDF_3("3", "上传影像成功"),
    SIMPLE_CREDIT_PDF_4("4", "简版征信 征信报告影像自动上传失败"),

    SIMPLE_CREDIT_DATA_0("0", "不存在该客户简版征信数据"),
    SIMPLE_CREDIT_DATA_1("1", "简版征信 征信数据保存成功"),
    SIMPLE_CREDIT_DATA_2("2", "简版征信 征信数据保存失败"),
    SIMPLE_CREDIT_DATA_3("3", "发送征信平台成功"),
    SIMPLE_CREDIT_DATA_4("4", "简版征信 客户征信数据发送征信平台失败 或者征信平台解析未完成"),
    SIMPLE_CREDIT_DATA_5("5", "简版征信 通知征信平台拉取个人简版征信数据完成"),

    STRATEGY_CREDIT_DATA_ERROR("0", "征信返回数据保存至CREDITDATA表异常"),
    STRATEGY_CREDIT_BASE_ERROR("0", "征信返回数据保存至CREDITBASE表异常"),
    STRATEGY_CREDIT_INPUT_ERROR("0", "组装输入参数异常"),

    STRATEGY_CREDIT_CALLDA_ERROR("0", "调用策略服务异常"),

    PRODUCT_CONFIG_ERROR("0", "产品表配置异常，请检查"),

    /**
     * 网销纯线上  130000
     */
    CUSTOMER_BASE_ERROR("130001", "保存用户级别信息参数为空"),

    CXS_APPLY_INFO_IS_NULL("130002", "保存申请信息参数为空"),

    CXS_CUSTOMER_EMP_IS_NULL("130003", "保存公司信息参数为空"),

    SUPPERED_ERROR("130004", "挂起任务失败"),

    RE_ASSIGN_ERROR("130005", "重新分件失败"),

    NOT_FUND_SUB_CHANNEL("130006","推送渠道暂不支持,请更正二级渠道来源"),

    /**
     * 消息推送  140000
     */
    SEND_MESSAGE_ERROR("140001", "消息推送失败"),

    /**
     * 员工贷   150000
     */
    SAVE_SATUS_ERROR("150001", "保存合同,数据状态异常"),
    ILLEGAL_DATA_ERROR("150002", "非法数据(无此申请单数据)"),
    ILLEGAL_PARAM_ERROR("150003", "非法数据(合同编号或申请单号为空)"),
    ILLEGAL_STATUS_DATA_ERROR("150004", "无有效签约状态数据"),
    EXIST_MULTIPLE_DATA_ILLEGAL_STATUS("150005", "非法数据(同一申请单号存在多条有效数据)"),
    HTML_DATA_ERROR("150006", "当前数据状态异常,请刷新页面"),

    TI_NET_AUTH("160001", "天润登陆验证接口异常"),
    SELECT_PRODUCT_ERROR("170001","查询产品异常，不存在符合条件的产品，请核查数据"),
    OFFLINE_EDUCATION_ERROR("190001", "调用学历接口异常，请手工核实学历信息"),
    APPLYINPUT_VALIDCERTMATURITY_ERROR("190003","证件长期有效为否时，校验证件有效期不能为空，请核实数据"),
    APPLYINPUT_VALIDCOMPTE_ERROR("190005","单位固定电话 和 上级单位固话 两者二选一必填，不可同时为空，请核实数据"),
    APPLYINPUT_VALIDEMPINFO_ALLNULL("190006","工商网查无 和工商网单位名称 二者只能必填其一，不可同时为空，请核实数据"),
    APPLYINPUT_VALIDEMPINFO_ALLIN("190007","工商网查无 和工商网单位名称 二者只能必填其一，不可同时填选，请核实数据"),
    APPLYINPUT_VALIDOWNINFO_NOTNULL("190010","客户身份不等于其他时，是否近1年内变更为法人和企业类型为必填项，请核实数据"),

    /**
     * 自动征信2   200000
     */
    FINAL_CALLHISTORY_GROUP_ERROR("200001", "根据[与申请人员关系]对电核记录进行分组异常!"),

    ;

    private String code;
    private String des;

    ErrorEnum(String code, String des) {
        this.code = code;
        this.des = des;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDes() {
        return des;
    }

    @Override
    public String toString() {
        return "ErrorEnum{" +
                "code='" + code + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}

