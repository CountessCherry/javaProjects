package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/** функції:
 •  сортування літаків за датою відправлення
 •  сортування літаків за містом призначення
 •  пошук літаку за номером
 •  додавання, редагування, видалення літаків
 клас «літак» має містити наступні поля:
 •  пункт призначення – строка
 •  номер рейсу – строка
 •  дату відправлення – дата
 •  кількість місць - ціле число **/

public class Plane {
    private String destination;
    private String flightNumber;
    private Date flightDate;
    private Integer sits;

    public Plane(String destination, String flightNumber, Date flightDate, Integer sits ) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.sits = sits;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Integer getSits() {
        return sits;
    }

    public void setSits(Integer sits) {
        this.sits = sits;
    }
}

class infoService {
    private List<Plane> planes = new ArrayList<Plane>();

    public void createPlane(String destination, String flightNumber, Date flightDate, Integer sits) {
        Plane p = new Plane(destination, flightNumber, flightDate, sits);
        planes.add(p);
    }

    public Plane findPlaneByNumber(String n) {
        for (Plane plane : planes) if (n.equals(plane.getFlightNumber())) return plane;
        return null;
    }

    public Plane deletePlane(String n) {
        Plane toRemove = findPlaneByNumber(n);
        if (toRemove != null) {
            planes.remove(toRemove);
        }
        return toRemove;
    }

    public void edit() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Choose plane to edit (enter flight number) or -1 to exit: ");
            String number = reader.readLine();
            if (number.equals("-1")) break;
            Plane toWorkWith = findPlaneByNumber(number);
            if (toWorkWith == null) {
                System.out.println("wrong plane number");
                continue;
            }
            while (true) {
                System.out.println("Chose what to edit:\n1 - flight date, 2 - flight number, \n3 - destination, 4 - sits number,\n5 - exit");
                int choice;
                try {
                    choice = Integer.parseInt(reader.readLine());
                } catch (Exception e) {
                    System.out.println("wrong input!");
                    continue;
                }
                if (choice == 5) break;
                switch (choice) {
                    case 1:
                        System.out.println("Enter new flight date (yyyy-MM-dd hh:mm:ss)");
                        String parseDate = reader.readLine();
                        Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(parseDate);
                        toWorkWith.setFlightDate(date);
                        break;
                    case 2:
                        System.out.println("Enter new flight number");
                        String n = reader.readLine();
                        toWorkWith.setFlightNumber(n);
                        break;
                    case 3:
                        System.out.println("Enter new destination");
                        String d = reader.readLine();
                        toWorkWith.setDestination(d);
                        break;
                    case 4:
                        System.out.println("Enter new sits number");
                        Integer s = Integer.parseInt(reader.readLine());
                        toWorkWith.setSits(s);
                        break;
                
                }
            }
        }

    }

    public void printPlaneInfo(Plane p) {
        System.out.println("Destination: " + p.getDestination() + " Flight date: " + p.getFlightDate() +
                " Flight number:" + p.getFlightNumber() + " Sits: " + p.getSits());
    }

    public void sortByDate() {
        planes.sort(Comparator.comparing(Plane::getFlightDate));
        planes.forEach(this::printPlaneInfo);
    }

    public void sortByDestination() {
        planes.sort(Comparator.comparing(Plane::getDestination));
        planes.forEach(this::printPlaneInfo);
    }

    public void main() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Chose what to do:\n1 - add plane, \n2 - remove plane, \n3 - edit plane, " +
                    "\n4 - sort by destination," +
                    "\n5 - sort by flight date," +
                    "\n6 - find plane by flight number," +
                    "\n7 - exit");
            int choice = Integer.parseInt(reader.readLine());
            if (choice == 7) break;
            switch (choice) {
                case 1:
                    System.out.println("Enter flight date (yyyy-MM-dd hh:mm:ss)");
                    String parseDate = reader.readLine();
                    Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(parseDate);
                    System.out.println("Enter flight number");
                    String n = reader.readLine();
                    System.out.println("Enter destination");
                    String d = reader.readLine();
                    System.out.println("Enter sits number");
                    Integer s = Integer.parseInt(reader.readLine());

                    this.createPlane(d, n, date, s);
                    break;
                case 2:
                    System.out.println("Enter flight number of the plane");
                    String numberToDel = reader.readLine();
                    this.deletePlane(numberToDel);
                    break;
                case 3 :
                    this.edit();
                case 4:
                    this.sortByDate();
                    break;
                case 5:
                    this.sortByDestination();
                    break;
                case 6:
                    System.out.println("Enter flight number of the plane");
                    String numberToFind = reader.readLine();
                    this.printPlaneInfo(this.findPlaneByNumber(numberToFind));
                    break;

            }
        }
    }

}

class MainProgram {
    public static void main(String[] args) throws IOException, ParseException {
        infoService service = new infoService();
        service.main();
    }
}