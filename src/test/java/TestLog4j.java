
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/5/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class TestLog4j {

    private static Logger logger = LoggerFactory.getLogger(TestLog4j.class);

    @Test
    public void test(){
        logger.info("info测试");
        logger.debug("debug测试 ");
        logger.error("error测试");
    }


}
