package lin.core.services.impl;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import lin.core.entity.TestEntity;
import lin.core.services.TestService;
import lin.util.IDGener;

@Named
//@Service
@Transactional
public class TestServiceImpl implements TestService{

	//@PersistenceContext(unitName="default2")
	@PersistenceContext
	private EntityManager jpa;
	
	@Override
	public TestEntity get(long id) {
		return jpa.find(TestEntity.class, id);
	}

	@Override
	public TestEntity save(TestEntity entity) {
		entity.setId(IDGener.next());
		entity.setName("name:"+IDGener.next());
		entity.setValue("value:"+IDGener.next());
		jpa.persist(entity);
		return entity;
	}

	@Override
	public TestEntity delete(long id) {
		return null;
	}

	@Override
	public List<TestEntity> list() {
		return null;
	}

}
