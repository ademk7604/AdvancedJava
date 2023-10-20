package d09_Memory_Management_StackVS_M;

public class DriverHeap {
	/*
	 * 1. Objeleri depolamayi saglayan alandir.
	 *  objelerimizin adresler stack de, degerleri heap de tutuluyor
	 *  2. Heap in boyutunun siniri yoktur
	 *  Stack e gore daha yavas objelere ulasilir
	 *  
	 *  Heap area - heap alani
	 *  old space - young space eski ve aktiv kullanlan alan
	 *  FIFO - ilk olusturulan obje old space den siliniyor
	 *  free - serbest birakilma islemi yapiliyor
	 *  GArbage Coletion sayesinde old space deki Objeleri FIFO ile free yapiliyor
	 *   
	 *    Stack Vs Heap
	 *    Stack -> static hafiza tahsisi icin kullanilir
	 *    HEap -> dinamik hafiza tahsisi icim kullaniliyor
	 *    
	 *    Stack -> Degiskenlere dogrudan ulasilir
	 *    Heap  -> DEgiskenlere dogrudan ulasilamaz bundan dolayi stack e gore daha yavas
	 *    
	 *    Stack -> Program compile time bellek tahsisi gerceklesiyor
	 *    Heap -> program runtime esnasinda bellek tahsisi gerceklesiyor
	 *    
	 *    
	 */

}
