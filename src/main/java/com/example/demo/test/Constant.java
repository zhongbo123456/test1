package com.example.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Constant {

    private Constant(){

    }

    //接口调用标志:成功
    public static final String SUCCESS = "1";

    //接口调用标志:失败
    public static final String FAIL = "0";

    //2分钟 超时
    public static final long TIME_OUT = 2 * 60 * 1000;

    //首次回复  4个字节
    public static final String Init_Message = "00010203";

    //心跳数据
    public static final String Beat_Message = "00";

    public static final String TCL_Beat_Message = "a400a4"; // length = 6
    public static final String TCL_CMD_Fail = "a10100a2"; // length = 8
    public static final String TCL_CMD_SUCCESS = "a10101a3";

    public static final int iMei_length = 15;
    public static final int beat_length = 2;
    public static final int long_beat_length = 8;
    public static final int upstream_length = 20;

    public static final int tcl_beat_length = 2; //00  Deprecated
    public static final int tcl_cmd_return_length = 22; //tcl命令响应 11字节
    public static final int tcl_upstream_length = 20;  // 10字节

    public static final int tcl_version_length = 17;  // 17字节  X-Q-G-TCL-N11-E01

    public static final int tcl_ups_real_length = 100; //Deprecated

    public static final int other_machine_length = 5; //咖啡机等

    public static final String tcl_freedom_data = "A30102000100000000A7"; //空闲心跳

    public static final List<String> tcl_freedom_datas = Arrays.asList(tcl_freedom_data, "A30101000100000000A6"); //空闲心跳  A30101000100000000A6 滚筒空闲

    public static final String Command_Success =   "A1000000000000000000A1"; //命令执行成功
    public static final String Command_Fail =      "A1010000000000000000A2"; //命令执行失败
    public static final String Command_UnKnow =    "A1020000000000000000A3"; // 命令解析失败【未知命令】
    public static final String Server_Version =    "A1030000000000000000A4"; //当前升级版本版本号【客户端查询命令】
    public static final String Version_Hash =      "A1040000000000000000A5"; //当前升级版本hash值【客户端查询命令】
    public static final String Client_Version =    "A1050001000000000000A5"; //客户端版本号0001-9999 ***替换 0001
    public static final String Upgrade_Success =   "A1060000000000000000A7"; // 升级成功
    public static final String Upgrade_Fail =      "A1070000000000000000A8"; // 升级失败
    public static final String Ger_Version =       "A1080001000000000000A8"; // 获取升级版本 0001-9999 ***替换 0001


    //重要  机器版本号 [0,30)
    public static final int Version_BL = 1;              // 第一版雷镭佰米波轮机器[M6312]  没有上传版本号, 默认为1
    public static final int Version_GT = 2;              // 第二版吕工[M6312]滚筒   从此版本号开始双向心跳, 存在很多问题, 信号质量很差
    public static final int Version_GT_N11 = 2;          // 辜兴宇滚筒N11[有方]修复版  添加查询信号强度命令
    public static final int Version_Blow = 3;            // 凌凯N11 吹风机[单吹风]
    public static final int Version_MC = 4;              // 凌凯N11 脉冲波轮[启动后断电]

    public static final int Version_Haier_N11 = 5;       // 凌凯N11波轮[海尔机器改装]  从此版本添加返回CCID和机器版本号
    public static final int Version_BL_N11 = 6;          // 凌凯N11波轮[TCL_N11]
    public static final int Version_HG_N11 = 7;          // N11烘干机

    //有方 N720V5 4G模块  [30, 50)    startTime 2019/7/8
    public static final int Version_BL_N720 = 30;         // N720波轮
    public static final int Version_GT_N720 = 31;         // N720滚筒
    public static final int Version_Haier_N720 = 32;      // N720波轮[海尔机器改装]
    public static final int Version_Blow_N720 = 33;       // N720吹风机
    public static final int Version_HG_N720 = 34;         // N720烘干机

    public static void main(String[] args) {
        System.out.println(TIME_OUT);
        System.out.println(Init_Message);
        System.out.println(Beat_Message);

        System.out.println(TimeUnit.MILLISECONDS.toSeconds(TIME_OUT));
    }

}
