package br.edu.fatecmm.projetovetor;

public class Main {

    public static void main(String[] args) {
	// exemplo de vetor
        int[] v = new int[10];
        //loop tradicional
        for (int i = 0; i < 10 ; i++) {
            System.out.println("vetor [" + i + "] = " + v[i]);
        }
        //loop com o foreach
        for (int x: v ) {
            System.out.println(x);
        }

        //Vetor de referencia
        Cliente vetCli[] = new Cliente[10];
        vetCli[0] = new Cliente();
        vetCli[0].nome = "madalena";
        vetCli[0].email = "madalena@gmail.com";
        vetCli[9] = new Cliente();
        vetCli[9].nome = "Juca";
        vetCli[9].email = "juca@gmail.com";
        //vetCli[0].imprimir();

        //varrer o vetor de clientes
        for (Cliente cliente: vetCli) {
           if(cliente!=null) cliente.imprimir();
        }

        int vet1[] = {15,20,30,50,10,20,30,1,2,3};
        int vet2[] = new int[10];
        System.arraycopy(vet1, 2, vet2, 7, 3);
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Vet2[" + i + "] = " + vet2[i]);
        }
        System.out.println("");

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Vet1[" + i + "] = " + vet1[i]);
        }
    }
}
