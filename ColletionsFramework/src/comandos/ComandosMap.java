package comandos;

import java.io.ObjectOutputStream.PutField;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.parser.Entity;

public class ComandosMap implements Iterable<ComandosMap>{

	public static void main(String[] args) {
		/*Dado os modelos dos carros e seus respectivos consumos na estrada faça:
		modelo = gol - consumo = 14,4km/l
		modelo = uno - consumo = 15,6km/l
		modelo = mobi - consumo = 16,1km/l
		modelo = hb20 - consumo = 14,5km/l
		modelo = kwid - consumo = 15,6km/l
		*/
		System.out.println("Crie um dicionário que relacione os modelos de carros e seus respectivos consumo:");
		Map<String, Double> carros = new HashMap<>() {{
			//método put adicona elementos
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}
		};

		System.out.println(carros);
		
		System.out.println("Subtitua o consumo do gol por 15,2 km/l:");
		carros.put("gol", 15.2);
		System.out.println(carros);
		
		System.out.println("Confira se o modelo tcson está adicionado: "+carros.containsKey("tucson"));
		
		System.out.println("Exiba o consumo do uno: "+carros.get("uno"));
		
//		System.out.println("Exiba o terceiro modelo adicionado:"); Map não tem o método index
		
		System.out.println("Exiba os modelos dos carros: ");
		Set<String> modelos = carros.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba o consumo dos carros: \n"+carros.values());
		
		System.out.println("Exiba o modelo mais econômico e seu consumo:");
		Double consumoMaisEficiente = Collections.max(carros.values());
		String modeloMaisEconomico = "";
		Set<Entry<String, Double>> maiorConsumo = carros.entrySet();
		for (Entry<String, Double> entry : maiorConsumo) {
			if(entry.getValue().equals(consumoMaisEficiente))
				modeloMaisEconomico = entry.getKey();
		}
		System.out.println(modeloMaisEconomico+" "+consumoMaisEficiente);
		
		System.out.println("Exiba o modelo menos econômico e seu consumo:");
		Double menorConsumo = Collections.min(carros.values());
		String modeloMenosEconomico = "";
		Set<Entry<String, Double>> consumo = carros.entrySet();
		for (Entry<String, Double> entry : consumo) {
			if(entry.getValue().equals(menorConsumo))
				modeloMenosEconomico = entry.getKey();
		}
		System.out.println(modeloMenosEconomico+" "+menorConsumo);
		
		System.out.println("Exiba a soma dos consumos: ");// Duas formas de resolver
		Double soma = 0.0;
		Set<Entry<String, Double>> consumos = carros.entrySet();
		for (Entry<String, Double> entry : consumos) {
			soma += entry.getValue();
		}
		System.out.println("Soma dos consumos: "+soma);
		// ou
		/*Iterator<Double> iterator = carros.values().iterator();
		soma = 0d;
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		System.out.println("Soma dos consumos: "+soma);
		*/
		
		System.out.println("Exiba a média dos consumos deste dicionário de carros: "+soma/carros.size());
		
		System.out.println("Remova os modelos com o consumo igual 15,6km/l:");
		Iterator<Double> consumoEspecifico = carros.values().iterator();
		while(consumoEspecifico.hasNext()) {			
			if(consumoEspecifico.next().equals(15.6))
				consumoEspecifico.remove();
		}
		System.out.println(carros);
		
		Map<String, Double> modelosCarros = new LinkedHashMap<>() {{
			put("gol", 15.2);
			put("uno", 16.2);
			put("kwid", 14.2);
			put("hb20", 17.2);
			put("modi", 13.2);
		}
		};
		System.out.println(modelosCarros);
		
		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		Map<String, Double> ordenaModelo = new TreeMap<>(modelosCarros);
		System.out.println(ordenaModelo);
		
		System.out.println("Apague o dicionário de carros:");
		carros.clear();
		System.out.println(carros);
		System.out.println("Verifique se a lista está vazia: "+carros.isEmpty());

	}

	@Override
	public Iterator<ComandosMap> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
