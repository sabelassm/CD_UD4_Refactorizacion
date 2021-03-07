import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * Clase principal, engloba los 5 caos de prueba programados.
 * @author Pablo Bourdelande García
 */
public class TestCases {

    private WebDriver driver;

    /** 
     * configura el webdriver.
     * redimensiona la ventana del navegador.
     */
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/pablo/Java Projects visual studio code/AmazonTest/driver/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1366, 900)); //Es necesario redimensionar para que no se oculte el contador del carrito ya que gettext() obtiene solo lo no oculto por css

    }
    /** 
     * Realiza el test sobre el cuadro de búsqueda de productos de la web de amazon.
     */
    @Test
    public void realizarBusqueda() {
        //Amazon no usa id para nada, todo está lleno de clases, lo que me complica bastante filtrar los elementos, por 
        // lo que he tenido que ser un poco creativo.

        driver.get("https://www.amazon.es/"); //Abrimos la página de amazon 						

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        String textoEsperado = "Discos duros sólidos internos";

        searchBox.sendKeys("Samsung M.2 SSD"); //Escribimos el texto a buscar en la caja de texto

        searchButton.click(); //Ejecutamos la accion de click para que realice la búsqueda

        WebElement elementobuscado = driver.findElement(By.id("n/937918031")); //Recuperamos una parte de la web para identificar si ha buscado bien

        String texto = elementobuscado.getText(); //Obtenemos el texto del elemento en cuestión.
        assertEquals(textoEsperado, texto); //Comprobamos si coincide con el esperado

    } //Fin realizarBusqueda

    /** 
     * Comprueba si existe en el menú izquierdo la sección departamentos.
     * @throws InterruptedException
     */
    @Test
    public void comprobarexistenciadepartamentos() throws InterruptedException {
        //Amazon no usa id para nada, todo está lleno de clases, lo que me complica bastante filtrar los elementos, por 
        // lo que he tenido que ser un poco creativo.

        driver.get("https://www.amazon.es/s?k=Samsung+M.2+SSD&__mk_es_ES=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss"); //Abrimos la página de amazon 						

        WebElement lista = driver.findElement(By.id("n-title"));
        Thread.sleep(2000);
        String textoEsperado = "Departamento";
        String texto = lista.getText(); //Obtenemos el texto del elemento en cuestión.
        assertEquals(textoEsperado, texto); //Comprobamos si coincide con el esperado

    } //Fin comprobarexistencia

    /** 
     * Chequea si existe un botón para cambiar la cantidad de elementos a comprar.
     * @throws InterruptedException
     */
    @Test
    public void cantidad() throws InterruptedException {
        //Amazon no usa id para nada, todo está lleno de clases, lo que me complica bastante filtrar los elementos, por 
        // lo que he tenido que ser un poco creativo.
        driver.get("https://www.amazon.es/gp/product/B07RP9PYY3/ref=ox_sc_saved_title_1?smid=A2JG3ZZUXYSD61&psc=1"); //Abrimos la página de amazon 						
        Thread.sleep(2000);
        WebElement cantidadButton = driver.findElement(By.id("quantity"));
        boolean aparece = cantidadButton.isDisplayed();
        assertTrue(aparece);
    } //Fin cantidad

    /** 
     * Comprueba el buen funcionamiento del botón "agregar a al cesta".
     * @throws InterruptedException
     */
    @Test
    public void cesta() throws InterruptedException {
        //Es necesario maximizar la ventana para que no se oculte el contador del carrito ya que gettext() obtiene solo lo no oculto por css 
        driver.get("https://www.pccomponentes.com/tempest-gaming-m8-20-speaker-system-altavoces-10w-rms");

        WebElement anadir = driver.findElement(By.id("add-cart"));
        anadir.click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.cssSelector("a > span.c-units"));
        String texto = element.getText();
        assertEquals("1", texto);
        Thread.sleep(2000);
    } //Fin cesta

    /** 
     * Intenta añadir un segundo elemento a comprar a la lista y comprueba
     * si la operación es correcta revisando la cantidad en la cesta.
     * @throws InterruptedException
     */
    @Test
    public void aumentarcantidad() throws InterruptedException {
        driver.get("https://www.pccomponentes.com/tempest-gaming-m8-20-speaker-system-altavoces-10w-rms");

        WebElement add = driver.findElement(By.cssSelector("button.quantity-add"));
        add.click(); //añadimos 1 unidad mas (se comprarán 2)
        Thread.sleep(2000);
        WebElement anadir = driver.findElement(By.id("add-cart")); //el input donde se muestra la cantidad no es localizable asi que "compramos"
        anadir.click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector("a > span.c-units")); //localizamos el numero donde se indica la cantidad de articulos
        String texto = element.getText();
        assertEquals("2", texto); //si es igual a 2, ha funcionado.	
        Thread.sleep(2000);
    }
    //Fin aumentarcantidad

    /** 
     * Cierra la conexión con el driver
     */
    @After
    public void shutdown() {
        driver.quit();
    }
}