package com.talentpath;
import com.talentpath.controllers.NounController;
import com.talentpath.daos.InMemNounDao;
import com.talentpath.daos.NounDao;
import com.talentpath.models.Noun;
import com.talentpath.services.NounService;
import com.talentpath.views.EnglishNounView;
import com.talentpath.views.NounView;


//1. Models Package
//      Lowest level package
//      Contains basic data definitions (classes that will serve as pure data containers)
//      Most classes will be "POJOs" Plain Old Java Object (just fields and setters/getters)
//2. Daos Package
//      Contains classes meant for data retrieval and storage
//      For now, this will just be in-memory storage that will
//      not persist from run to run, but later we'll use databases
//
//      contains dao interfaces, as well as multiple implementations for
//      working with different sorts of persistence (databases, files, in-memory, etc)
//      the rest of our layers should not worry about which specific persistence
//      mechanism we're using and only refer to the interfaces
//3. Service Package
//      contain business logic classes
//      this layer cannot communicate with the user, so we'll end up producing requests
//      and generating responses here (generate exceptions on certain sorts of validation failures)
//4. Controllers Package
//      Mediates between the user and the rest of the application, routing incoming requests/data to
//      the correct service layer methods and then routing the responses/data back to the user
//      through the correct view
//5. Views "Package" (eventually there won't be a package but instead a folder of templates)
//      this will hold our methods for displaying data to the user and requesting input
//      we'll break this into a helper class for getting user input and a single
//      view class that holds all display methods


public class Main {

    public static void main(String[] args) {

        NounView view = new EnglishNounView();

        NounDao dao = new InMemNounDao();
        NounService service = new NounService(dao);

        NounController controller = new NounController(view, service);

        controller.run();


    }
}
