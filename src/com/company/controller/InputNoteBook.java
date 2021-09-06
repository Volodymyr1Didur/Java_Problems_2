package com.company.controller;

import com.company.model.Data_saving;
import com.company.model.Model;
import com.company.view.View;

import javax.xml.crypto.Data;
import java.util.Scanner;

import static com.company.controller.RegexContainer.*;
import static com.company.controller.RegexContainer.REGEX_LOGIN;
import static com.company.view.TextConstant.*;
import static com.company.view.TextConstant.LOGIN_DATA;
 ;
public class InputNoteBook {
    private View view;
    private Scanner sc;
    private Model model;

    private String firstName;
    private String login;
    private String secondName;



    public InputNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        model.setNameUkr(utilityController.inputStringValueWithScanner(FIRST_NAME, str));
        model.setLogin(utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN));
        model.setSecondName(utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_SECOND_NAME));
        model.setFuthersName(utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_FATHERS_NAME));
        model.setFullName(model.getNameUkr(),model.getSecondName() ,model.getFuthersName());

    }
}
