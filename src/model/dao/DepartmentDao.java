package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//operação resposavel por inserir no banco de dados o obj enviado no parametro de entrada:
	void insert(Department obj);
	//atualiza:
	void update(Department obj);
	//deleta:
	void deleteById(Integer id);
	//pega o Id e consulta no DB um obj com o Id recebido, se existir retorna, senao, retorna null
	Department findById(Integer id);
	//Retornar todos os departamentos: findAll();
	List<Department> findAll();
	
}
