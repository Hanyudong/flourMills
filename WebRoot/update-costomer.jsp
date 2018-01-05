<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>客户修改</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="css/matrix-style.css"/>
    <link rel="stylesheet" href="css/matrix-media.css"/>
    <link rel="stylesheet" href="css/uniform.css"/>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css"/>
    <link rel="stylesheet" href="css/jquery.gritter.css"/>
    <style type="text/css">
        .span6 {
            padding-left: 10px;
        }
        .form-group{
            margin-bottom: 10px;
        }
        .form-group span{
            color: #ff0000;
        }

        .btn-group>.btn:last-child{
            margin-left: 30%;
        }
    </style>

  </head>
  
  <body>
    <!--Header-part-->
<div id="header">
    <h3><a href="index.jsp">大风车管理系统</a></h3>
</div>
<!--close-Header-part-->
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav">
        <li id="profile-messages"><a title="" href="#"><i class="icon icon-user"></i> <span class="text">欢迎用户</span></a>
        </li>
        <li class=""><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span
                class="text">退出登录</span></a></li>
    </ul>
</div>
<!--close-top-Header-menu-->
<!--sidebar-menu-->
<div id="sidebar">
    <a href="#" class="visible-phone"><i class="icon icon-home"></i>menu</a>
    <ul>
        <li><a href="index.jsp"><i class="icon icon-home"></i> <span>首页</span></a></li>
        <li class="submenu"><a href="javascript:;"><i class="icon icon-th-list"></i> <span>原粮兑换面粉</span></a>
            <ul>
                <li><a href="warehouse.jsp">原粮入库</a></li>
                <li><a href="face-dusting.jsp">面粉领用</a></li>
                <li><a href="warehouse-treatment.jsp">库存处理</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-plane"></i> <span>面粉厂原粮购置</span></a>
            <ul>
                <li><a href="original-purchase.jsp">面粉厂原粮购置</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-user-md"></i> <span>面粉厂面粉加工</span></a>
            <ul>
                <li><a href="face-milling.jsp">面粉厂面粉加工</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-shopping-cart"></i> <span>面粉厂产品销售</span></a>
            <ul>
                <li><a href="goods.jsp">面粉厂产品销售</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="revenue-check.jsp">
                <i class="icon icon-pencil"></i>
                <span>欠款催收管理</span></a>
            <ul>
                <li><a href="mandatory-management.jsp">欠款催收管理</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>收入支出流水登记</span></a>
            <ul>
                <li><a href="registration.jsp">收入支出流水登记</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="warehouse-point.jsp"><i class="icon icon-file"></i> <span>面粉产库存清点</span></a>
            <ul>
                <li><a href="warehouse-point.jsp">面粉库存清点</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>查询凭证报表</span></a>
            <ul>
                <li><a href="input-inspection.jsp">原粮入库查询</a></li>
                <li><a href="dissertative-research.jsp">原粮领用查询</a></li>
                <li><a href="processing-accounting.jsp">面粉加工查询</a></li>
                <li><a href="output-check.jsp">产品出库查询</a></li>
                <li><a href="purchasing-inspection.jsp">原粮购置查询</a></li>
                <li><a href="sales-inquiry.jsp">产品销售查询</a></li>
                <li><a href="revenue-check.jsp">收入/支出查询</a></li>
            </ul>
        </li>
        <li class="submenu active"><a href="#"><i class="icon icon-file"></i> <span>系统参数</span></a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/systemUserAction!getPageList.action">系统用户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/customerAction!getPageList.action">客户管理</a></li>
                <li><a href="${pageContext.request.contextPath}/productTypeAction!getPageList.action">产品类型管理</a></li>
            </ul>
        </li>
        <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>凭证打印</span></a>
            <ul>
                <li><a href="document-printing.jsp">凭证打印</a></li>
            </ul>
        </li>
    </ul>
</div>
<!--sidebar-menu-->
<!--main-container-part-->
<div id="content">
    <!--breadcrumbs面包屑导航-->
    <div id="content-header">
        <div id="breadcrumb">
            <a href="index.jsp" title="返回主页" class="tip-bottom"><i class="icon-home"></i> 主页</a>
            <a href="sys-user-message.jsp" class="current" title="系统用户管理">客户管理</a>
        </div>
        <h1>客户修改</h1>
    </div>
    <!--End-breadcrumbs-->
    <div class="row-fluid">
        <div class="span3"></div>
        <div class="span6">
            <div class="widget-box">
                <div class="widget-title"><span class="icon"> <i class="icon-align-justify"></i> </span>
                    <h5>客户修改</h5>
                </div>
                <div class="widget-content nopadding">
                    <form action="customerAction" method="post" class="form-horizontal clearfix">
						<input type="hidden" name="method:updateCustomer" value="xyz"/>
                        <div class="form-group clearfix">
                            <lable class="span3">客户编号</lable>
                            <div class="span7">
                                <input type="text" name="customerId"  value="<s:property value="#customer.customerId"/>" readonly="readonly">
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <lable for="username" class="span3">客户姓名/企业名称</lable>
                            <div class="span7">
                                <input type="text" id="username" name="customerName" value="<s:property value="#customer.customerName"/>" title="客户姓名/企业名称"  required="required">
                                <span>*</span>
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <lable for="phone" class="span3">联系地址</lable>
                            <div class="span7">
                                <input type="text" name="address"  value="<s:property value="#customer.address"/>" title="联系地址"  required="required">
                                <span>*</span>
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <lable for="name" class="span3">身份证/机构代码号</lable>
                            <div class="span7">
                                <input type="text" id="name" name="idCard" value="<s:property value="#customer.idCard"/>" required="required">
                                <span>*</span>
                            </div>
                        </div>
                        <div class="form-group clearfix">
                            <lable for="phone" class="span3">移动电话</lable>
                            <div class="span7">
                                <input type="tel" id="phone" name="mobile" value="<s:property value="#customer.mobile"/>" title="联系电话">
                            </div>
                        </div>

                        <div class="form-group clearfix">
                            <lable for="phone" class="span3">固定电话</lable>
                            <div class="span7">
                                <input type="tel" name="landLine" value="<s:property value="#customer.landLine"/>" title="联系电话">
                            </div>
                        </div>
                        <div class="span3"></div>
                        <div class="btn-group span5">
                            <button type="submit" class="btn btn-default">修改</button>
                            <button type="reset" class="btn btn-default">取消</button>
                        </div>
                        <div class="span3"></div>
                    </form>
                </div>
            </div>
        </div>
        <div class="span3"></div>
    </div>

</div>
<!--end-main-container-part-->
<!--Footer-part-->
<div class="row-fluid">
    <div id="footer" class="span12"> 2017 &copy; 大风车管理系统. 欢迎致电 <a href="#">00000000000</a></div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/matrix.js"></script>
<script src="js/jquery.peity.min.js"></script>
<script src="js/check_add.js"></script>
  </body>
</html>
