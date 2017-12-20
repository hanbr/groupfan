package com.nb.groupfan.common;


/**
 * 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.nb.groupfan";//项目基础包名称，根据自己公司的项目修改

    public static final String ENTITY_PACKAGE = BASE_PACKAGE + ".entity";//Entity所在包
    public static final String DAO_PACKAGE = BASE_PACKAGE + ".dao";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service所在包
//    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controller";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".common.BaseDao";//Mapper插件基础接口的完全限定名
}
