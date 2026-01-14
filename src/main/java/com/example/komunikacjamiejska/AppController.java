package com.example.komunikacjamiejska;

import com.example.komunikacjamiejska.tables.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Controller
public class AppController implements WebMvcConfigurer {

    private final SalesDAO dao;
    private final AdresyDAO adresydao;
    private final AutobusyDAO autobusydao;
    private final BiletyDAO biletyDAO;
    private final CzasoweDAO czasoweDAO;
    private final DlugoterminoweDAO dlugoterminoweDAO;
    private final Jednostki_KomunikacjiDAO jednostki_komunikacjiDAO;
    private final KierowcyDAO kierowcyDAO;
    private final KontrolerzyDAO kontrolerzyDAO;
    private final KursyDAO kursyDAO;
    private final LinieDAO linieDAO;
    private final MarkiDAO markiDAO;
    private final ModeleDAO modeleDAO;
    private final ObsadyDAO obsadyDAO;
    private final PracownicyDAO pracownicyDAO;
    private final PrzypisaniaDAO przypisaniaDAO;
    private final Przystanek_w_liniiDAO przystanek_w_liniiDAO;
    private final PrzystankiDAO przystankiDAO;
    private final WynagrodzeniaDAO wynagrodzeniaDAO;


    public AppController(SalesDAO dao, AdresyDAO adresydao, AutobusyDAO autobusydao, BiletyDAO biletyDAO, CzasoweDAO czasoweDAO, DlugoterminoweDAO dlugoterminoweDAO, Jednostki_KomunikacjiDAO jednostki_komunikacjiDAO, KierowcyDAO kierowcyDAO, KontrolerzyDAO kontrolerzyDAO, KursyDAO kursyDAO, LinieDAO linieDAO, MarkiDAO markiDAO, ModeleDAO modeleDAO, ObsadyDAO obsadyDAO, PracownicyDAO pracownicyDAO, PrzypisaniaDAO przypisaniaDAO, Przystanek_w_liniiDAO przystanek_w_liniiDAO, PrzystankiDAO przystankiDAO, WynagrodzeniaDAO wynagrodzeniaDAO) {
        this.dao = dao;
        this.adresydao = adresydao;
        this.autobusydao = autobusydao;
        this.biletyDAO = biletyDAO;
        this.czasoweDAO = czasoweDAO;
        this.dlugoterminoweDAO = dlugoterminoweDAO;
        this.jednostki_komunikacjiDAO = jednostki_komunikacjiDAO;
        this.kierowcyDAO = kierowcyDAO;
        this.kontrolerzyDAO = kontrolerzyDAO;
        this.kursyDAO = kursyDAO;
        this.linieDAO = linieDAO;
        this.markiDAO = markiDAO;
        this.modeleDAO = modeleDAO;
        this.obsadyDAO = obsadyDAO;
        this.pracownicyDAO = pracownicyDAO;
        this.przypisaniaDAO = przypisaniaDAO;
        this.przystanek_w_liniiDAO = przystanek_w_liniiDAO;
        this.przystankiDAO = przystankiDAO;
        this.wynagrodzeniaDAO = wynagrodzeniaDAO;
    }

    @RequestMapping(value = {"/index", "/"})
    public String viewHomePage(Model model){
        List<Sale> listSale = dao.list();
        model.addAttribute("listSale", listSale);
        List<Adresy> listAdresy = adresydao.list();
        model.addAttribute("listAdresy", listAdresy);
        List<Autobusy> listAutobusy = autobusydao.list();
        model.addAttribute("listAutobusy", listAutobusy);
        List<Bilety> listBilety = biletyDAO.list();
        model.addAttribute("listBilety", listBilety);
        List<Czasowe> listCzasowe = czasoweDAO.list();
        model.addAttribute("listCzasowe", listCzasowe);
        List<Dlugoterminowe> listDlugoterminowe = dlugoterminoweDAO.list();
        model.addAttribute("listDlugoterminowe", listDlugoterminowe);
        List<Jednostki_Komunikacji> listJednostki_Komunikacji = jednostki_komunikacjiDAO.list();
        model.addAttribute("listJednostki_Komunikacji", listJednostki_Komunikacji);
        List<Kierowcy> listKierowcy = kierowcyDAO.list();
        model.addAttribute("listKierowcy", listKierowcy);
        List<Kontrolerzy> listKontrolerzy = kontrolerzyDAO.list();
        model.addAttribute("listKontrolerzy", listKontrolerzy);
        List<Kursy> listKursy = kursyDAO.list();
        model.addAttribute("listKursy", listKursy);
        List<Linie> listLinie = linieDAO.list();
        model.addAttribute("listLinie", listLinie);
        List<Marki> listMarki = markiDAO.list();
        model.addAttribute("listMarki", listMarki);
        List<Modele> listModele = modeleDAO.list();
        model.addAttribute("listModele", listModele);
        List<Obsady> listObsady = obsadyDAO.list();
        model.addAttribute("listObsady", listObsady);
        List<Pracownicy> listPracownicy = pracownicyDAO.list();
        model.addAttribute("listPracownicy", listPracownicy);
        List<Przypisania> listPrzypisania = przypisaniaDAO.list();
        model.addAttribute("listPrzypisania", listPrzypisania);
        List<Przystanek_w_linii> listPrzystanek_w_linii = przystanek_w_liniiDAO.list();
        model.addAttribute("listPrzypstanek_w_linii", listPrzystanek_w_linii);
        List<Przystanki> listPrzystanki = przystankiDAO.list();
        model.addAttribute("listPrzystanki", listPrzystanki);
        List<Wynagrodzenia> listWynagrodzenia = wynagrodzeniaDAO.list();
        model.addAttribute("listWynagrodzenia", listWynagrodzenia);
        return "index";
    }

    @RequestMapping(value = {"/admin_main"})
    public String viewAdminPage(Model model){
        List<Sale> listSale = dao.list();
        model.addAttribute("listSale", listSale);
        Sale sale = new Sale();
        model.addAttribute("sale", sale);
        List<Adresy> listAdresy = adresydao.list();
        model.addAttribute("listAdresy", listAdresy);
        Adresy adresy = new Adresy();
        model.addAttribute("adresy", adresy);
        List<Autobusy> listAutobusy = autobusydao.list();
        model.addAttribute("listAutobusy", listAutobusy);
        Autobusy autobusy = new Autobusy();
        model.addAttribute("autobusy", autobusy);
        List<Bilety> listBilety = biletyDAO.list();
        model.addAttribute("listBilety", listBilety);
        Bilety bilety = new Bilety();
        model.addAttribute("bilety", bilety);
        List<Czasowe> listCzasowe = czasoweDAO.list();
        model.addAttribute("listCzasowe", listCzasowe);
        Czasowe czasowe = new Czasowe();
        model.addAttribute("czasowe", czasowe);
        List<Dlugoterminowe> listDlugoterminowe = dlugoterminoweDAO.list();
        model.addAttribute("listDlugoterminowe", listDlugoterminowe);
        Dlugoterminowe dlugoterminowe = new Dlugoterminowe();
        model.addAttribute("dlugoterminowe", dlugoterminowe);
        List<Jednostki_Komunikacji> listJednostki_Komunikacji = jednostki_komunikacjiDAO.list();
        model.addAttribute("listJednostki_Komunikacji",  listJednostki_Komunikacji);
        Jednostki_Komunikacji jednostki_komunikacji = new Jednostki_Komunikacji();
        model.addAttribute("jednostki_komunikacji", jednostki_komunikacji);
        List<Kierowcy> listKierowcy = kierowcyDAO.list();
        model.addAttribute("listKierowcy", listKierowcy);
        Kierowcy kierowcy = new Kierowcy();
        model.addAttribute("kierowcy", kierowcy);
        List<Kontrolerzy> listKontrolerzy = kontrolerzyDAO.list();
        model.addAttribute("listKontrolerzy", listKontrolerzy);
        Kontrolerzy kontrolerzy = new Kontrolerzy();
        model.addAttribute("kontrolerzy", kontrolerzy);
        List<Kursy> listKursy = kursyDAO.list();
        model.addAttribute("listKursy", listKursy);
        Kursy kursy = new Kursy();
        model.addAttribute("kursy", kursy);
        List<Linie> listLinie = linieDAO.list();
        model.addAttribute("listLinie", listLinie);
        Linie linie = new Linie();
        model.addAttribute("linie", linie);
        List<Marki> listMarki = markiDAO.list();
        model.addAttribute("listMarki", listMarki);
        Marki marki = new Marki();
        model.addAttribute("marki", marki);
        List<Modele> listModele = modeleDAO.list();
        model.addAttribute("listModele", listModele);
        Modele modele = new Modele();
        model.addAttribute("modele", modele);
        List<Obsady> listObsady = obsadyDAO.list();
        model.addAttribute("listObsady", listObsady);
        Obsady obsady = new Obsady();
        model.addAttribute("obsady", obsady);
        List<Pracownicy> listPracownicy = pracownicyDAO.list();
        model.addAttribute("listPracownicy", listPracownicy);
        Pracownicy pracownicy = new Pracownicy();
        model.addAttribute("pracownicy", pracownicy);
        List<Przypisania> listPrzypisania = przypisaniaDAO.list();
        model.addAttribute("listPrzypisania", listPrzypisania);
        Przypisania przypisania = new Przypisania();
        model.addAttribute("przypisania", przypisania);
        List<Przystanek_w_linii> listPrzystanek_w_linii = przystanek_w_liniiDAO.list();
        model.addAttribute("listPrzypstanek_w_linii", listPrzystanek_w_linii);
        Przystanek_w_linii przystanek_w_linii = new Przystanek_w_linii();
        model.addAttribute("przystanek_w_linii", przystanek_w_linii);
        List<Przystanki> listPrzystanki = przystankiDAO.list();
        model.addAttribute("listPrzystanki", listPrzystanki);
        Przystanki przystanki = new Przystanki();
        model.addAttribute("przystanki", przystanki);
        List<Wynagrodzenia> listWynagrodzenia = wynagrodzeniaDAO.list();
        model.addAttribute("listWynagrodzenia", listWynagrodzenia);
        Wynagrodzenia wynagrodzenia = new Wynagrodzenia();
        model.addAttribute("wynagrodzenia", wynagrodzenia);


        return "admin/admin_main";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("sale") Sale sale) {
        dao.save(sale);
        return "redirect:/admin_main";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("sale") Sale sale) {
        dao.update(sale);
        return "redirect:/admin_main";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/admin_main";
    }

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/perspectives").setViewName("perspectives");
        registry.addViewController("/admin_main").setViewName("admin/admin_main");
        registry.addViewController("/user_main").setViewName("user/user_main");
    }

    @Controller
    public static class DashboardController {
        @RequestMapping("/perspectives")
        public String defaultSuccessUrl(HttpServletRequest request) {
            if (request.isUserInRole("ADMIN")) {
                return "redirect:/admin_main";
            } else if (request.isUserInRole("USER")) {
                return "redirect:/user_main";
            } else {
                return "redirect:/index";
            }
        }
    }
}
