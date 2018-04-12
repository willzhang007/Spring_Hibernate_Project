package willzhang.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import willzhang.model.vo.DataGrid;
import willzhang.model.vo.Log;
import willzhang.model.vo.User;

public interface LogServiceI {

	public void beforeLog(JoinPoint point);

	public void afterLog(JoinPoint point);

	public Object aroundLog(ProceedingJoinPoint point);
	
	public DataGrid datagrid(Log log);

}
