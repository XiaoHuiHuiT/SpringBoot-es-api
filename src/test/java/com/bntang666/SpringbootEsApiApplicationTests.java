package com.bntang666;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEsApiApplicationTests {

	@Autowired
	@Qualifier(value = "restHighLevelClient")
	private RestHighLevelClient client;

	@Test
	void contextLoads() {

	}

}
