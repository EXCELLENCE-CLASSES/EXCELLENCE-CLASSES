package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
class DownloadManager2ApplicationTests {

	@Test
	void testInsertDocument() {
		File file=new File("C:\\Users\\Ritesh\\Documents\\MyDocument\\Test.pdf");
		ExcellenceDocument exc=new ExcellenceDocument();
		exc.setName(file.getName());
		
		try {
			byte[] bytes=Files.readAllBytes(file.toPath());
			exc.setContent(bytes);
			exc.setSize(bytes.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
