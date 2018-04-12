package willzhang.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import willzhang.controller.BaseController;
import willzhang.model.vo.DataGrid;
import willzhang.model.vo.Log;
import willzhang.service.LogServiceI;

@Controller
@RequestMapping("/logController")
public class LogController extends BaseController{

	private static final Logger logger = Logger.getLogger(LogController.class);
	
	@Autowired
	private LogServiceI logService;

	@RequestMapping("/log")
	public String log() {
		return "/admin/log";
	}
	
	@ResponseBody
	@RequestMapping("/datagrid")
	public DataGrid datagrid(Log log) {
		return logService.datagrid(log);
	}
}
