import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "servlet", urlPatterns = "/product")
public class Servlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Product[] products = {new Product(1, "Apple", 100),
                new Product(2, "Orange", 150),
                new Product(3, "Apple", 100)};
       for (Product product : products) {
            resp.getWriter().println(product.getId()+" "+product.getTitle()+" "+product.getCost());
        }
    }
}
