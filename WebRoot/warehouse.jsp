<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>原粮入库</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="css/matrix-style.css"/>
    <link rel="stylesheet" href="css/matrix-media.css"/>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.css"/>
    <link rel="stylesheet" href="css/jquery.gritter.css"/>
    <link rel="stylesheet" href="css/index-style.css"/>

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
        <li class="submenu active"><a href="javascript:;"><i class="icon icon-th-list"></i> <span>原粮兑换面粉</span></a>
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
        <li class="submenu"><a href="#"><i class="icon icon-file"></i> <span>系统参数</span></a>
            <ul>
                <li><a href="sys-user-message.jsp">系统用户管理</a></li>
                <li><a href="customer-management.jsp">客户管理</a></li>
                <li><a href="product-type-management.jsp">产品类型管理</a></li>
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
        <div id="breadcrumb"> <a href="index.jsp" title="回到主页" class="tip-bottom"><i class="icon-home"></i>主页</a> <a href="warehouse.jsp" class="current">原粮入库</a> </div>
    </div>
    <!--End-breadcrumbs-->
    <h1>欢迎来到大风车管理系统</h1>
    <!--Action boxes-->
    <div class="container-fluid">
        <div class="quick-actions_homepage">
        </div>
        <!--End-Action boxes-->
        <hr/>
    </div>
</div>
<!--end-main-container-part-->
<!--Footer-part-->
<div class="row-fluid">
    <div id="footer" class="span12"> 2015 &copy; 大风车管理系统. 欢迎致电 <a href="#">00000000000</a></div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/matrix.js"></script>
<script src="js/matrix.tables.js"></script>
<script type="text/javascript">
    // This function is called from the pop-up menus to transfer to
    // a different page. Ignore if the value returned is a null string:
    function goPage(newURL) {

        // if url is empty, skip the menu dividers and reset the menu selection to default
        if (newURL != "") {

            // if url is "-", it is this page -- reset the menu:
            if (newURL == "-") {
                resetMenu();
            }
            // else, send page to designated URL
            else {
                document.location.href = newURL;
            }
        }
    }

    // resets the menu selection upon entry to this page:
    function resetMenu() {
        document.gomenu.selector.selectedIndex = 2;
    }
</script>
  </body>
</html>
