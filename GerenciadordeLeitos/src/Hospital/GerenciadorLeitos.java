package Hospital; 

import java.util.List; 
import java.util.ArrayList; 

public class GerenciadorLeitos { 
   private List<Leito> leitos; 
   
   public GerenciadorLeitos(int quantidade) { 
      if (quantidade <= 0) { 
         throw new IllegalArgumentException("Quantidade de leitos deve ser positivo."); 
         } 
      leitos = new ArrayList<>(); 
      for (int i = 1; i <= quantidade; i++) { 
         leitos.add(new Leito(i, null, null));
         } 
      } 
   
   public void listarLeitos() {
      leitos.forEach(leito -> {
         if (leito.isOcupado()) { 
            System.out.println("Leito " + leito.getNumero() +
                  " - Ocupado por " + leito.getPaciente().getNome() + 
                  " (Diagnóstico: " + leito.getPaciente().getDiagnostico() + 
                  " Contaminado: " + leito.getPaciente().isContaminado() + ")"); 
            } else { 
               System.out.println("Leito " + leito.getNumero() + " - Disponível"); 
               } 
         }); 
      } 
   
   public void ocuparLeito(int numero, Paciente paciente) {
      validarNumero1(numero); 
      Leito leito = leitos.get(numero - 1); 
      
      if (leito.isOcupado()) { 
         throw new IllegalStateException("Leito " + numero + " já está ocupado."); 
         } 
      
      for (Leito l : leitos) { 
         if (l.isOcupado()) { 
            if (l.getPaciente().isContaminado() != paciente.isContaminado()) {
               throw new IllegalStateException("Não é permitido misturar pacientes contaminados com limpos!"); 
               } 
            } 
         } 
      
      leito.ocupar(paciente); 
      System.out.println("Paciente " + paciente.getNome() + " internado no leito " + numero); 
      } 
   
   public void liberarLeito(int numero) {
      validarNumero1(numero); 
      Leito leito = leitos.get(numero - 1); 
      if (!leito.isOcupado()) { 
         throw new IllegalStateException("Leito " + numero + " já está livre."); 
         } 
      leito.liberar(); 
      System.out.println("Leito " + numero + " liberado."); 
      } 
   
   private void validarNumero1(int numero) { 
      if (numero < 1 || numero > leitos.size()) { 
         throw new IllegalArgumentException("Número de leito inválido: " + numero); 
         } 
      } 
   
   public void internarPaciente(Paciente paciente) { 
      for (Leito leito : leitos) { 
         if (!leito.isOcupado()) { 
            for (Leito l : leitos) { 
               if (l.isOcupado()) { 
                  if (l.getPaciente().isContaminado() != paciente.isContaminado()) { 
                     throw new IllegalStateException("Não é permitido misturar pacientes contaminados com limpos!"); 
                     } 
                  }
               } 
            if (paciente.isContaminado()) { 
               System.out.println(" Atenção: Paciente " + paciente.getNome() + " está contaminado. Necessário isolamento!"); 
               } 
            
            leito.ocupar(paciente); 
            System.out.println("Paciente " + paciente.getNome() + " internado no leito " + leito.getNumero()); 
            return; 
            } 
         } 
      throw new IllegalStateException("Não há leitos disponíveis para internar o paciente."); }
   }



