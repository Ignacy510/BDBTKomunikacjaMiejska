package com.example.komunikacjamiejska;

import com.example.komunikacjamiejska.tables.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.security.Principal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class AppController implements WebMvcConfigurer {

    //private final SalesDAO dao;
    private final AdresyDAO adresyDAO;
    private final AutobusyDAO autobusyDAO;
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

    private final InMemoryUserDetailsManager userDetailsManager;
    private final PasswordEncoder passwordEncoder;

    //SalesDAO dao
    public AppController(AdresyDAO adresyDAO, AutobusyDAO autobusyDAO, BiletyDAO biletyDAO, CzasoweDAO czasoweDAO, DlugoterminoweDAO dlugoterminoweDAO, Jednostki_KomunikacjiDAO jednostki_komunikacjiDAO, KierowcyDAO kierowcyDAO, KontrolerzyDAO kontrolerzyDAO, KursyDAO kursyDAO, LinieDAO linieDAO, MarkiDAO markiDAO, ModeleDAO modeleDAO, ObsadyDAO obsadyDAO, PracownicyDAO pracownicyDAO, PrzypisaniaDAO przypisaniaDAO, Przystanek_w_liniiDAO przystanek_w_liniiDAO, PrzystankiDAO przystankiDAO, WynagrodzeniaDAO wynagrodzeniaDAO, InMemoryUserDetailsManager userDetailsManager, PasswordEncoder passwordEncoder) {
        //this.dao = dao;
        this.adresyDAO = adresyDAO;
        this.autobusyDAO = autobusyDAO;
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
        this.userDetailsManager = userDetailsManager;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping({"/index", "/"})
    public String viewHomePage(Model model){
        //List<Sale> listSale = dao.list();
        //model.addAttribute("listSale", listSale);
//        List<Adresy> listAdresy = adresyDAO.list();
//        model.addAttribute("listAdresy", listAdresy);
//        List<Autobusy> listAutobusy = autobusyDAO.list();
//        model.addAttribute("listAutobusy", listAutobusy);
//        List<Bilety> listBilety = biletyDAO.list();
//        model.addAttribute("listBilety", listBilety);
//        List<Czasowe> listCzasowe = czasoweDAO.list();
//        model.addAttribute("listCzasowe", listCzasowe);
//        List<Dlugoterminowe> listDlugoterminowe = dlugoterminoweDAO.list();
//        model.addAttribute("listDlugoterminowe", listDlugoterminowe);
//        List<Jednostki_Komunikacji> listJednostki_Komunikacji = jednostki_komunikacjiDAO.list();
//        model.addAttribute("listJednostki_Komunikacji", listJednostki_Komunikacji);
//        List<Kierowcy> listKierowcy = kierowcyDAO.list();
//        model.addAttribute("listKierowcy", listKierowcy);
//        List<Kontrolerzy> listKontrolerzy = kontrolerzyDAO.list();
//        model.addAttribute("listKontrolerzy", listKontrolerzy);
//        List<Kursy> listKursy = kursyDAO.list();
//        model.addAttribute("listKursy", listKursy);
//        List<Linie> listLinie = linieDAO.list();
//        model.addAttribute("listLinie", listLinie);
//        List<Marki> listMarki = markiDAO.list();
//        model.addAttribute("listMarki", listMarki);
//        List<Modele> listModele = modeleDAO.list();
//        model.addAttribute("listModele", listModele);
//        List<Obsady> listObsady = obsadyDAO.list();
//        model.addAttribute("listObsady", listObsady);
//        List<Pracownicy> listPracownicy = pracownicyDAO.list();
//        model.addAttribute("listPracownicy", listPracownicy);
//        List<Przypisania> listPrzypisania = przypisaniaDAO.list();
//        model.addAttribute("listPrzypisania", listPrzypisania);
//        List<Przystanek_w_linii> listPrzystanek_w_linii = przystanek_w_liniiDAO.list();
//        model.addAttribute("listPrzypstanek_w_linii", listPrzystanek_w_linii);
//        List<Przystanki> listPrzystanki = przystankiDAO.list();
//        model.addAttribute("listPrzystanki", listPrzystanki);
//        List<Wynagrodzenia> listWynagrodzenia = wynagrodzeniaDAO.list();
//        model.addAttribute("listWynagrodzenia", listWynagrodzenia);
        model.addAttribute("listLinie", linieDAO.list());
        model.addAttribute("linie",  new Linie());

        model.addAttribute("wybranaLinia", null);
        model.addAttribute("przystanek_w_linii", List.of());

        return "index";
    }

    @RequestMapping(value = {"/admin_main"})
    public String viewAdminPage(Model model){
        //List<Sale> listSale = dao.list();
        //model.addAttribute("listSale", listSale);
        //Sale sale = new Sale();
        //model.addAttribute("sale", sale);
//        List<Adresy> listAdresy = adresyDAO.list();
//        model.addAttribute("listAdresy", listAdresy);
//        Adresy adresy = new Adresy();
//        model.addAttribute("adresy", adresy);
//        List<Autobusy> listAutobusy = autobusyDAO.list();
//        model.addAttribute("listAutobusy", listAutobusy);
//        Autobusy autobusy = new Autobusy();
//        model.addAttribute("autobusy", autobusy);
//        List<Bilety> listBilety = biletyDAO.list();
//        model.addAttribute("listBilety", listBilety);
//        Bilety bilety = new Bilety();
//        model.addAttribute("bilety", bilety);
//        List<Czasowe> listCzasowe = czasoweDAO.list();
//        model.addAttribute("listCzasowe", listCzasowe);
//        Czasowe czasowe = new Czasowe();
//        model.addAttribute("czasowe", czasowe);
//        List<Dlugoterminowe> listDlugoterminowe = dlugoterminoweDAO.list();
//        model.addAttribute("listDlugoterminowe", listDlugoterminowe);
//        Dlugoterminowe dlugoterminowe = new Dlugoterminowe();
//        model.addAttribute("dlugoterminowe", dlugoterminowe);
//        List<Jednostki_Komunikacji> listJednostki_Komunikacji = jednostki_komunikacjiDAO.list();
//        model.addAttribute("listJednostki_Komunikacji",  listJednostki_Komunikacji);
//        Jednostki_Komunikacji jednostki_komunikacji = new Jednostki_Komunikacji();
//        model.addAttribute("jednostki_komunikacji", jednostki_komunikacji);
//        List<Kierowcy> listKierowcy = kierowcyDAO.list();
//        model.addAttribute("listKierowcy", listKierowcy);
//        Kierowcy kierowcy = new Kierowcy();
//        model.addAttribute("kierowcy", kierowcy);
//        List<Kontrolerzy> listKontrolerzy = kontrolerzyDAO.list();
//        model.addAttribute("listKontrolerzy", listKontrolerzy);
//        Kontrolerzy kontrolerzy = new Kontrolerzy();
//        model.addAttribute("kontrolerzy", kontrolerzy);
//        List<Kursy> listKursy = kursyDAO.list();
//        model.addAttribute("listKursy", listKursy);
//        Kursy kursy = new Kursy();
//        model.addAttribute("kursy", kursy);
//        List<Linie> listLinie = linieDAO.list();
//        model.addAttribute("listLinie", listLinie);
//        Linie linie = new Linie();
//        model.addAttribute("linie", linie);
//        List<Marki> listMarki = markiDAO.list();
//        model.addAttribute("listMarki", listMarki);
//        Marki marki = new Marki();
//        model.addAttribute("marki", marki);
//        List<Modele> listModele = modeleDAO.list();
//        model.addAttribute("listModele", listModele);
//        Modele modele = new Modele();
//        model.addAttribute("modele", modele);
//        List<Obsady> listObsady = obsadyDAO.list();
//        model.addAttribute("listObsady", listObsady);
//        Obsady obsady = new Obsady();
//        model.addAttribute("obsady", obsady);

        List<Pracownicy> pracownicy = pracownicyDAO.list();

        Map<Integer, Boolean> mapaKont = pracownicy.stream()
                .collect(Collectors.toMap(
                        Pracownicy::getNr_pracownika,
                        p -> userDetailsManager.userExists("user" + p.getNr_pracownika())
                ));

        Map<Integer, String> mapaAdresow = adresyDAO.list().stream()
                .collect(Collectors.toMap(
                        Adresy::getNr_adresu,
                        a -> (a.getMiasto() != null ? a.getMiasto() : "") + ", ul. " +
                                (a.getUlica() != null ? a.getUlica() : "") + " " +
                                (a.getNr_domu() != null ? a.getNr_domu() : "") +
                                (a.getNr_lokalu() != null && !a.getNr_lokalu().isEmpty() ? "/" + a.getNr_lokalu() : "")
                ));

        model.addAttribute("listPracownicy", pracownicy);
        model.addAttribute("pracownicy", new Pracownicy());
        model.addAttribute("mapaKont", mapaKont);
        model.addAttribute("mapaAdresow", mapaAdresow);

//        List<Przypisania> listPrzypisania = przypisaniaDAO.list();
//        model.addAttribute("listPrzypisania", listPrzypisania);
//        Przypisania przypisania = new Przypisania();
//        model.addAttribute("przypisania", przypisania);
//        List<Przystanek_w_linii> listPrzystanek_w_linii = przystanek_w_liniiDAO.list();
//        model.addAttribute("listPrzypstanek_w_linii", listPrzystanek_w_linii);
//        Przystanek_w_linii przystanek_w_linii = new Przystanek_w_linii();
//        model.addAttribute("przystanek_w_linii", przystanek_w_linii);
//        List<Przystanki> listPrzystanki = przystankiDAO.list();
//        model.addAttribute("listPrzystanki", listPrzystanki);
//        Przystanki przystanki = new Przystanki();
//        model.addAttribute("przystanki", przystanki);
//        List<Wynagrodzenia> listWynagrodzenia = wynagrodzeniaDAO.list();
//        model.addAttribute("listWynagrodzenia", listWynagrodzenia);
//        Wynagrodzenia wynagrodzenia = new Wynagrodzenia();
//        model.addAttribute("wynagrodzenia", wynagrodzenia);


        return "admin/admin_main";
    }

    @PostMapping("/admin/createAccount")
    public String createAccount(@RequestParam("nr_pracownika") int id,
                                @RequestParam("username") String username,
                                @RequestParam("password") String password) {
        if (!userDetailsManager.userExists(username)) {
            createUserInternal(username, password);
        }
        return "redirect:/admin_main";
    }

    @PostMapping("/admin/editAccount")
    public String editAccount(@RequestParam("oldUsername") String oldUsername,
                              @RequestParam("newUsername") String newUsername,
                              @RequestParam("newPassword") String newPassword,
                              @RequestParam(value = "action", required = false) String action) {

        if (userDetailsManager.userExists(oldUsername)) {
            if ("delete".equals(action)) {
                userDetailsManager.deleteUser(oldUsername);
            }
            else {
                userDetailsManager.deleteUser(oldUsername);
                createUserInternal(newUsername, newPassword);
            }
        }
        return "redirect:/admin_main";
    }

    private void createUserInternal(String username, String password) {
        UserDetails user = User.withUsername(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build();
        userDetailsManager.createUser(user);
    }

    @GetMapping("/user_main")
    public String viewUserPage(Model model, Principal principal) {
        String login = principal.getName();

        int finalIdPracownika = -1;

        String numbers = login.replaceAll("[^0-9]", "");
        if (!numbers.isEmpty()) {
            try {
                finalIdPracownika = Integer.parseInt(numbers);
            } catch (NumberFormatException e) {}
        }

        if ("user1".equals(login)) finalIdPracownika = 1;
        if ("user2".equals(login)) finalIdPracownika = 2;

        int finalId = finalIdPracownika;

        Pracownicy zalogowanyPracownik = pracownicyDAO.list().stream()
                .filter(p -> p.getNr_pracownika() == finalId)
                .findFirst()
                .orElse(null);

        List<Obsady> mojeObsady = obsadyDAO.list().stream()
                .filter(o -> o.getNr_pracownika() == finalId)
                .collect(Collectors.toList());

        List<Integer> idKursow = mojeObsady.stream()
                .map(Obsady::getNr_kursu)
                .collect(Collectors.toList());

        List<Kursy> mojeKursy = kursyDAO.list().stream()
                .filter(k -> idKursow.contains(k.getNr_kursu()))
                .collect(Collectors.toList());

        Map<Integer, Przystanki> slownikPrzystankow = przystankiDAO.list().stream()
                .collect(Collectors.toMap(Przystanki::getNr_przystanku, p -> p));

        java.util.Map<Integer, Linie> mapaLinii = new java.util.HashMap<>();
        java.util.Map<Integer, Autobusy> mapaAutobusow = new java.util.HashMap<>();
        java.util.Map<Integer, List<Przystanek_w_linii>> mapaTras = new java.util.HashMap<>();
        java.util.Map<Integer, String> mapaStatusow = new java.util.HashMap<>();

        LocalDate dzisiaj = LocalDate.now();

        for (Kursy kurs : mojeKursy) {
            Linie linia = linieDAO.list().stream().filter(l -> l.getNr_linii() == kurs.getNr_linii()).findFirst().orElse(new Linie());
            mapaLinii.put(kurs.getNr_kursu(), linia);

            Autobusy autobus = autobusyDAO.list().stream().filter(a -> a.getNr_autobusu() == kurs.getNr_autobusu()).findFirst().orElse(new Autobusy());
            mapaAutobusow.put(kurs.getNr_kursu(), autobus);

            List<Przystanek_w_linii> trasa = przystanek_w_liniiDAO.list().stream()
                    .filter(p -> p.getNr_linii() == kurs.getNr_linii())
                    .sorted(Comparator.comparingInt(Przystanek_w_linii::getKolejnosc))
                    .collect(Collectors.toList());
            mapaTras.put(kurs.getNr_kursu(), trasa);

            LocalDate dataStartu = null;
            LocalDate dataKonca = null;
            try {
                if (kurs.getData_rozpoczecia() != null) {
                    String s = kurs.getData_rozpoczecia().toString();
                    if(s.contains(" ")) s = s.split(" ")[0];
                    dataStartu = LocalDate.parse(s);
                }
                if (kurs.getData_zakonczenia() != null) {
                    String s = kurs.getData_zakonczenia().toString();
                    if(s.contains(" ")) s = s.split(" ")[0];
                    dataKonca = LocalDate.parse(s);
                }
            } catch (Exception e) {}

            if (dataKonca != null && dataKonca.isBefore(dzisiaj)) {
                mapaStatusow.put(kurs.getNr_kursu(), "Zakończony");
            } else if (dataStartu != null && dataStartu.isAfter(dzisiaj)) {
                mapaStatusow.put(kurs.getNr_kursu(), "Zaplanowany");
            } else {
                mapaStatusow.put(kurs.getNr_kursu(), "W trakcie");
            }
        }

        model.addAttribute("pracownik", zalogowanyPracownik);
        model.addAttribute("mojeKursy", mojeKursy);
        model.addAttribute("mapaLinii", mapaLinii);
        model.addAttribute("mapaAutobusow", mapaAutobusow);
        model.addAttribute("mapaTras", mapaTras);
        model.addAttribute("slownikPrzystankow", slownikPrzystankow);
        model.addAttribute("mapaStatusow", mapaStatusow);

        if (zalogowanyPracownik == null) {
            model.addAttribute("error", "Brak danych pracownika dla zalogowanego użytkownika.");
        }

        return "user/user_main";
    }

    @GetMapping("/bus_stops/{nr_linii}")
    public String showBusStops(@PathVariable int nr_linii, Model model) {
        model.addAttribute("listLinie", linieDAO.list());
        Map<Integer, Przystanki> mapaPrzystankow = przystankiDAO.list().stream().collect(Collectors.toMap(Przystanki::getNr_przystanku, p -> p));
        List<Przystanek_w_linii> przystanek_w_linii = przystanek_w_liniiDAO.list().stream()
                .filter(p -> p.getNr_linii() == nr_linii)
                .sorted(Comparator.comparingInt(Przystanek_w_linii::getKolejnosc)).toList();
        model.addAttribute("wybranaLinia", nr_linii);
        model.addAttribute("przystanek_w_linii", przystanek_w_linii);
        model.addAttribute("mapaPrzystankow", mapaPrzystankow);
        return "index";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("pracownicy") Pracownicy pracownicy,
                       @RequestParam("miasto") String miasto,
                       @RequestParam("ulica") String ulica,
                       @RequestParam("nr_domu") String nrDomu,
                       @RequestParam(value = "nr_lokalu", required = false) String nrLokalu,
                       @RequestParam("kod_pocztowy") String kodPocztowy) {

        Adresy nowyAdres = new Adresy();
        nowyAdres.setMiasto(miasto);
        nowyAdres.setUlica(ulica);
        nowyAdres.setNr_domu(nrDomu);
        nowyAdres.setNr_lokalu(nrLokalu);
        nowyAdres.setKod_pocztowy(kodPocztowy);

        adresyDAO.save(nowyAdres);
        int idAdresu = adresyDAO.getLastId();
        pracownicy.setNr_adresu(idAdresu);
        pracownicyDAO.save(pracownicy);

        return "redirect:/admin_main";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("pracownicy") Pracownicy pracownicy) {
        pracownicyDAO.update(pracownicy);
        return "redirect:/admin_main";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        pracownicyDAO.delete(id);
        return "redirect:/admin_main";
    }

    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/index").setViewName("index");
//        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
//        registry.addViewController("/perspectives").setViewName("perspectives");
//        registry.addViewController("/admin_main").setViewName("admin/admin_main");
//        registry.addViewController("/user_main").setViewName("user/user_main");
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