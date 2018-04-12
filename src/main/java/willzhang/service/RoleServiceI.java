package willzhang.service;

import java.util.List;

import willzhang.model.vo.DataGrid;
import willzhang.model.vo.Role;

public interface RoleServiceI {

	public void add(Role role);

	public void edit(Role role);

	public void delete(String ids);
	
	public DataGrid datagrid(Role role);
	
	public List<Role> combobox();

}
