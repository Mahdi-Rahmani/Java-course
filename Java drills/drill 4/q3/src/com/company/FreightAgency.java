package com.company;
import java.util.ArrayList;

/**
 * Keeps Cargoes data
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class FreightAgency {

    //keeps cargoes
    private ArrayList<Cargo> cargoes;

    //keeps Clients
    private ArrayList<Client> clients;

    /**
     * Create a new FreightAgency
     */
    public FreightAgency() {
        cargoes = new ArrayList<>();
        clients = new ArrayList<>();
    }

    /**
     * Add Cargo to CargoList
     *
     * @param cargo we want to add
     */
    public void addCargo(Cargo cargo) {
        cargoes.add(cargo);
    }

    /**
     * Add Client to ClientList
     *
     * @param client we want to add
     */
    public void addClient(Client client) {
        clients.add(client);
    }

    /**
     * Remove a cargo from CargoList
     *
     * @param cargo we want to add
     */
    public void removeCargo(Cargo cargo) {
        cargoes.remove(cargo);
    }

    /**
     * Show list of cargoes
     * if there isn`t any cargo show a suitable message
     */
    public void showCargoList() {
        if (cargoes.size() == 0)
            System.out.println("No cargo added yet");
        else
        {
            for (int i = 0 ;i < cargoes.size() ;i++)
            {
                if (cargoes.get(i).hasInsurance())
                    System.out.println(i+1 + ". " + cargoes.get(i).getPrice() + "  insured  " +cargoes.get(i).origin +"  "+cargoes.get(i).destination +" " +cargoes.get(i).type);
                else
                    System.out.println(i+1 + ". " + cargoes.get(i).getPrice() + "  notInsured  " +cargoes.get(i).origin +"  "+cargoes.get(i).destination +" " +cargoes.get(i).type);
            }
        }
    }

    /**
     * show the clients
     */
    public void showClients()
    {
        for (int i = 0 ;i < clients.size() ;i++)
            System.out.println(i+1 + ". "+clients.get(i).toString());

    }

    /**
     * get the clients list
     * @return clients field
     */
    public ArrayList<Client> getClients()
    {
        return clients;
    }

}
