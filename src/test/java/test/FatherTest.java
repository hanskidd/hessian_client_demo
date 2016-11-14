package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.kidd.api.domain.User;
import com.kidd.api.service.UserService;
import com.kidd.client.service.BaseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-common.xml" })
//@Transactional
//@Rollback(value = false)
public class FatherTest {

	@Autowired
	private BaseService baseService;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testHessian(){
		User user = baseService.getUserInfoByIdFromRemote(1);
		System.out.println(user);
		
		user = userService.getUserById(1);
		System.out.println(user);
	}
	
}
