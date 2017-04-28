package de.hsbo.ksw.aufg3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

@WebServlet(value = "/weather", name = "weather")
public class WeatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        resp.setHeader("Content-Type", "application/json");

        OpenWeatherMap owa = new OpenWeatherMap("61cbc8eeb7a3f9b15cb8b583b4ea5cda");

        String city = "";
        try {
            city = req.getParameter("city");
            if(city == null)
                city = "Bochum";
        } catch (Exception e) {
            city = "Bochum";
        }

        CurrentWeather cwd = owa.currentWeatherByCityName(city);

        Map<String, String> result = new HashMap<>();
        result.put("city", city);
        result.put("temp", "" + cwd.getMainInstance().getTemperature());
        result.put("humidity", "" + cwd.getMainInstance().getHumidity());

        resp.getWriter().print(new ObjectMapper().writeValueAsString(result));
    }
}
