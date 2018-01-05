<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>面粉库存清点</title>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="css/bootstrap.min.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
  <link rel="stylesheet" href="css/matrix-style.css" />
  <link rel="stylesheet" href="css/matrix-media.css" />
  <link rel="stylesheet" href="css/uniform.css" />
  <link rel="stylesheet" href="css/jquery.gritter.css" />
  <link rel="stylesheet" href="css/bootstrap-wysihtml5.css" />
  <link rel="stylesheet" href="font-awesome/css/font-awesome.css" />
  <style type="text/css">
  @media (min-width: 1200px){
    .row-fluid{
        padding-left: 20px;
    } 
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
      <li class="submenu active"><a href="warehouse-point.jsp"><i class="icon icon-file"></i> <span>面粉产库存清点</span></a>
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
      <div id="breadcrumb"> 
        <a href="index.jsp" title="回到主页" class="tip-bottom"><i class="icon-home"></i>主页</a> 
        <a href="warehouse-point.jsp" title="面粉库存清点" class="current">面粉库存清点</a>
      </div>
      <h1>面粉库存清点</h1>
    </div>
    <!--End-breadcrumbs-->
    <div class="row-fluid">
      <div class="span6">
        <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
            <h5>添加商品详情</h5>
          </div>
          <div class="widget-content nopadding">
            <form action="#" method="get" class="form-horizontal">
              <div class="control-group">
                <label class="control-label">商品分类</label>
                <div class="controls">
                  <select >
                    <option>--请选择--</option>
                    <option value="学习用品">学习用品</option>
                    <option value="服装">服装</option>
                    <option value="食品">食品</option>
                    <option value="其它">其它</option>
                  </select>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">挂货分类</label>
                <div class="controls">
                  <select >
                    <option>--请选择--</option>
                    <option value="闲互送">闲互送</option>
                    <option value="闲互换">闲互换</option>
                    <option value="聚便宜">聚便宜</option>
                  </select>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">商品名称:</label>
                <div class="controls">
                  <input type="text" class="span11" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">商品数量:</label>
                <div class="controls">
                  <input type="text" class="span11" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">没人限购的数量:</label>
                <div class="controls">
                  <input type="text" class="span11" />
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">商品摘要</label>
                <div class="controls">
                  <textarea class="span11" ></textarea>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label">上传文件</label>
                <div class="controls f-files">
                  <input type="file"/>
                </div>
                <div class="controls">
                  <input type="button" id="f-add" class="btn btn-success" value="增加一行"/>
                  <input type="submit" value="上传">
                </div>
              </div>
              <div class="form-actions text-right">
                <input type="submit" class="btn btn-success" value="添加">
              </div>
            </form>
          </div>
        </div>
      </div>
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
  <script src="js/jquery.peity.min.js"></script>
  </body>
</html>
