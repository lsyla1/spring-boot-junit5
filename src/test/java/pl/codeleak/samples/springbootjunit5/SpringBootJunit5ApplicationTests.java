package pl.codeleak.samples.springbootjunit5;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class SpringBootJunit5ApplicationTests {
    @Autowired
    private MeterRegistry meterRegistry;
    private final AtomicInteger testGauge;
    private final Counter testCounter;
    testGauge = meterRegistry.gauge("custom_gauge", new AtomicInteger(0));
   testCounter = meterRegistry.counter("custom_counter");
    @Test
    void contextLoads() {
    }

}
