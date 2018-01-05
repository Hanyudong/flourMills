package cn.sjzc.flour.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.sjzc.flour.pojo.GrainPut;
import cn.sjzc.flour.service.GrainPutService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller
@Scope("prototype")
public class GrainPutAction extends ActionSupport implements ModelDriven<GrainPut>{
	
	private  GrainPut  grainput;
	@Resource
	private  GrainPutService grainputservice;
	

    //public String findAll(){
      //CustomerAction.
   // }
//打开添加页面
	public String addPage() {
			
			return "addPage";
	}
	public String addgrainput(){
		grainputservice.addGrainPut(grainput);
		return "add";
	}
	  
    public String findAll() {
		
		return "findAll";
	}
    
	public GrainPutAction() {
		
	}
	public GrainPutAction(GrainPutService grainputservice){
		super();
		this.grainputservice=grainputservice;
		
	}

	public String successGrainPut(){
		//System.out.println(grainput.getEvidenceId());
		GrainPut pi=null;
		
		List<GrainPut> grainputs = grainputservice.findAll();
//		//for(int i=0;i<processs.size();i++){
//		//	if(process.getEvno()==processs.get(i).getEvno()){
//				pi=processs.get(i);
//			}
//		}
		if(pi==null){
		ActionContext.getContext().put("p",pi);
		ActionContext.getContext().getValueStack().push(pi);
		}
		grainputservice.addGrainPut(grainput);
        System.out.println("111");
		return "success";
	}
	
	
public GrainPut getModel() {
	
	if( grainput == null ){
		grainput = new GrainPut();
	}
	return grainput;
}
	//set get方法
    public GrainPut getGrainput() {
		return grainput;
	}
	public void setGrainput(GrainPut grainput) {
		this.grainput = grainput;
	}
	public GrainPutService getGrainputservice() {
		return grainputservice;
	}
	public void setGrainputservice(GrainPutService grainputservice) {
		this.grainputservice = grainputservice;
	}

	
}
