package imlsw96.archive.infra.db;

import static org.assertj.core.api.Assertions.assertThat;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import java.sql.SQLException;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@SpringBootTest
public class DataSourceTest {

  @Autowired
  private DataSource dataSource;

  @Autowired
  private EntityManagerFactory entityManagerFactory;

  @Autowired
  private PlatformTransactionManager transactionManager;

  @Test
  void testDataSource() throws SQLException {
    assertThat(dataSource).isNotNull();
    assertThat(dataSource).isInstanceOf(HikariDataSource.class);
    assertThat(entityManagerFactory).isNotNull();
    assertThat(transactionManager).isNotNull();
    assertThat(transactionManager).isInstanceOf(JpaTransactionManager.class);
  }
}
