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
    
    <title>商品类型管理</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="css/uniform.css" />
  <link rel="stylesheet" href="css/select2.css" />
  <link rel="stylesheet" href="css/matrix-style.css" />
  <link rel="stylesheet" href="css/matrix-media.css" />
  <link rel="stylesheet" href="font-awesome/css/font-awesome.css"/>
  <style type="text/css">

    .tips {
      border-top: 1px solid #eeeeee;
      border-bottom: 1px solid #eeeeee;
    }
    .nopadding .table-bordered{
      border-bottom: 1px solid #EEEEEE;
    }
    .btn-block{
      border-radius: 5px;
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
      <li class=""><a title="" href="login.jsp"><i class="icon icon-share-alt"></i> <span class="text">退出登录</span></a></li>
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
    <div id="content-header">
      <div id="breadcrumb"> <a href="index.jsp" title="回到主页" class="tip-bottom"><i class="icon-home"></i>主页</a> <a href="product-type-management.jsp" class="current">商品类型管理</a> </div>
      <h1>商品类型管理</h1>
    </div>
    <div class="row-fluid">
      <div class="span2"></div>
      <div class="span8">
        <div class="widget-box">
          <div class="widget-title"><span class="icon"> <i class="icon-align-justify"></i> </span>
            <h5>商品类型管理</h5>
          </div>
          <div class="widget-content nopadding clearfix">

            <div class="">
              <table class=" table table-bordered">
                <thead>
                <tr>
                  <td>编号</td>
                  <td>产品名称</td>
                  <td>标志</td>
                  <td>操作</td>
                </tr>
                </thead>
                <%-- <s:iterator value="#productTypes">
	                <tr>
	                  <td><s:property value="typeId"/></td>
	                  <td><a href="productTypeAction?method:editProductType=xxx&typeId=<s:property value="typeId"/>"><s:property value="typeName"/></a></td>
	                  <td><input type="checkbox" name="checkbox"></td>
	                  <td><a href="">修改</a></td>
	                </tr>
                </s:iterator>
				 --%>
				
				<s:iterator value="pageBean.list">
	                <tr>
	                  <td><s:property value="typeId"/></td>
	                  <td><a href="productTypeAction?method:editProductType=xxx&typeId=<s:property value="typeId"/>"><s:property value="typeName"/></a></td>
	                  <td><input type="checkbox" name="checkbox"></td>
	                  <td><a href="">修改</a></td>
	                </tr>
                </s:iterator>
              </table>

            </div>
            <hr>
            <div class="clearfix">
              <div class="span3"></div>
              <div class="span2"><a href="addProduct.jsp" class="btn btn-block ">添加</a></div>
              <div class="span2"><a href="javascript:deleteUser()" class="btn btn-block ">删除</a></div>
              <div class="span2"><a href="" class="btn btn-block ">取消</a></div>
            </div>
            <hr>
            <div class="tips text-center">
              <p>*请点击产品名对用户进行修改</p>
            </div>
            <div class="text-center">
              <p>总页数:<s:property value="pageBean.totalPage" /> 当前页数:<s:property value="pageBean.currentPage" /></p>
            </div>
          </div>
        </div>
        <div class="pagination alternate text-center">
          <ul>
          <!-- 
            <li class="disabled"><a href="#">首页</a></li>
            <li class=""><a href="#">上一页</a></li>
            <li class="active"><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">下一页</a></li>
            <li><a href="#">尾页</a></li>
             -->
           
           <s:if test="%{pageBean.currentPage == 1}">
	       		<li class="disabled">首页</li>
	            <li class="">上一页</li>
	       </s:if>
	       <s:else>
	            <li class="disabled"><a href="${pageContext.request.contextPath}/productTypeAction?method:getPageList=xxx&page=1">首页</a></li>
	            <li class=""><a href="${pageContext.request.contextPath}/productTypeAction?method:getPageList=xxx&page=<s:property value="%{pageBean.currentPage-1}"/>">上一页</a></li>
           </s:else>
           <s:if test="%{pageBean.currentPage != pageBean.totalPage}">
                <li><a href="${pageContext.request.contextPath}/productTypeAction?method:getPageList=xxx&page=<s:property value="%{pageBean.currentPage+1}"/>">下一页</a></li>
                <li><a href="${pageContext.request.contextPath}/productTypeAction?method:getPageList=xxx&page=<s:property value="pageBean.totalPage"/>">尾页</a></li>
           </s:if>
           <s:else>
	            <li><a href="#">下一页</a></li>
	            <li><a href="#">尾页</a></li>
           </s:else>
           
          </ul>
        </div>
      </div>
      <div class="span2"></div>
    </div>
  </div>
  <!--end-main-container-part-->
  <!--Footer-part-->
  <div class="row-fluid">
    <div id="footer" class="span12"> 2017 &copy; 大风车管理系统. 欢迎致电 <a href="#">00000000000</a> </div>
  </div>
  <!--end-Footer-part-->
  <script src="js/jquery.min.js"></script> 
  <script src="js/jquery.ui.custom.js"></script> 
  <script src="js/bootstrap.min.js"></script> 
  <script src="js/jquery.uniform.js"></script> 
  <script src="js/select2.min.js"></script> 
  <script src="js/matrix.js"></script>
  <script src="js/productMessage.js"></script>
  </body>
</html>
