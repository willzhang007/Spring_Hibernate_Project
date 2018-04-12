package willzhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import willzhang.controller.BaseController;
import willzhang.model.vo.DataGrid;
import willzhang.model.vo.Online;
import willzhang.service.OnlineServiceI;

@Controller
@RequestMapping("/onlineController")
public class OnlineController extends BaseController {

	@Autowired
	private OnlineServiceI onlineService;

	@RequestMapping("/doNotNeedSession_onlineDatagrid")
	@ResponseBody
	public DataGrid doNotNeedSession_onlineDatagrid(Online online) {
		return onlineService.datagrid(online);
	}

}
