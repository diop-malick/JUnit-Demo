package demo5.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Locale;

import static com.google.common.collect.Lists.newArrayList;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.spy;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author <a href="mailto:diop-malick@hotmail.fr">Malick</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class OrderBDDTest {

    @Mock Product product1;
    @Mock Product product2;

    @Test
    public void should_have_a_total_price_equal_to_8_99() throws Exception {
        Order order = new Order(newArrayList(product1, product2));
        // given
        given(product1.getPrice()).willReturn(new BigDecimal("3.99"));
        given(product2.getPrice()).willReturn(new BigDecimal("5.00"));
        // when
        BigDecimal totalPrice = order.getTotalPrice();
        // then
        assertThat(totalPrice, equalTo(new BigDecimal("8.99")));
    }

    @Test
    public void should_format_total_price_to_10_00_euros_string() throws Exception {
        Order order = spy(new Order(null));
        // given
        given(order.getTotalPrice()).willReturn(BigDecimal.TEN);
        // when
        String price = order.formatTotalPrice(Locale.FRANCE);
        // then
        assertThat(price, equalTo("10,00 €"));
    }
}
