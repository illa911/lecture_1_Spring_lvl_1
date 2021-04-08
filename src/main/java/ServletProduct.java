import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Product", urlPatterns = "/product")
public class ServletProduct extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Product.class);

    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        logger.info("Products are withdrawn");
        List<Product> product = List.of(
                new Product(1, "apple", 1),
                new Product(2, "lemon", 2),
                new Product(3, "pineapple", 3),
                new Product(4, "milk", 4),
                new Product(5, "water", 5),
                new Product(6, "book", 6),
                new Product(7, "lime", 7),
                new Product(8, "pizza", 81),
                new Product(9, "duck", 9),
                new Product(10, "cat", 10)
        );
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < 10; i++) {
            resp.getWriter().printf("<h1>"+ product.get(i) +"</h1>");
        }
        resp.getWriter().printf("</html></body>");
    }
}
