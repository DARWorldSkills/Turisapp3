package com.aprendiz.ragp.quindioturistico3b.models;

import com.aprendiz.ragp.quindioturistico3b.R;

public class ListasSitios {
    //Declaración de objetos loscuales van en la lista Sitios
    public static Sitio portal = new Sitio();
    public static Sitio unicentro = new Sitio();
    public static Sitio armenia = new Sitio();
    public static Sitio parque = new Sitio();
    public static Sitio panaca = new Sitio();
    public static Sitio satelo = new Sitio();
    public static Sitio penas_blancas = new Sitio();
    public static Sitio mama_lulu = new Sitio();
    public static Sitio arrieros = new Sitio();

    public void inputSitios() {
        portal.setImagen(R.drawable.portal_del_quindio);
        unicentro.setImagen(R.drawable.unicentro);
        armenia.setImagen(R.drawable.calima);
        parque.setImagen(R.drawable.parque_cafe);
        panaca.setImagen(R.drawable.panaca);
        satelo.setImagen(R.drawable.salento);
        penas_blancas.setImagen(R.drawable.penas_blancas);
        mama_lulu.setImagen(R.drawable.granja_mama_lulu);
        arrieros.setImagen(R.drawable.los_arrieros);

        portal.setNombre("Centro Comercial Portal del Quindío.");
        unicentro.setNombre("Unicentro - Armenia.");
        armenia.setNombre("Calima Centro Comercial Armenia");
        parque.setNombre("Parque del Café");
        panaca.setNombre("Panaca");
        satelo.setNombre("Salento");
        penas_blancas.setNombre("Eco Parque Peñas Blancas");
        mama_lulu.setNombre("La Pequeña Granja de Mamá Lulú");
        arrieros.setNombre("Parque Los Arrieros");

        portal.setDescripcionc("El Centro Comercial Portal del Quindio, ubicado en el norte de Armenia, es el centro comercial, más grande e importante del Quindío.");
        unicentro.setDescripcionc("Unicentro Armenia inaugurado en Septiembre de 2.012,  ubicado en la  esquina de la Avenida Bolívar con la Calle 4B ");
        armenia.setDescripcionc("Calima Armenia nace de la necesidad de la ciudad y la región de abrir nuevos espacios comerciales para atender un mercado creciente");
        parque.setDescripcionc("El Parque del Café  brinda a sus visitantes diversión y entretenimiento a través de la cultura cafetera");
        panaca.setDescripcionc("Somos el primer parque temático agropecuario en el mundo y el más grande en Latinoamérica");
        satelo.setDescripcionc("Salento es un municipio colombiano en el departamento del Quindío.");
        penas_blancas.setDescripcionc("ofrece un recorrido lleno de aire, naturaleza y paisaje");
        mama_lulu.setDescripcionc("La Pequeña Granja de Mamá Lulú, es un paraíso ecológico");
        arrieros.setDescripcionc("EL Parque Los Arrieros es un lugar que ofrece servicios turísticos de recreación");

        portal.setUbicacion("Dirección: Av Bolivar # 19 Norte 46 Armenia.");
        unicentro.setUbicacion("Avenida Bolívar con Calle 4B.");
        armenia.setUbicacion("Calima Centro Comercial Armenia");
        parque.setUbicacion("Montenegro Quindio");
        panaca.setUbicacion("Kilometro 7, Vía Vereda Kerman Quimbaya, Quindío.");
        satelo.setUbicacion("Municipio en Colombia");
        penas_blancas.setUbicacion("Corregimiento la virginia en Calarcá");
        mama_lulu.setUbicacion("Quimbaya Quindio");
        arrieros.setUbicacion("Quimbaya Quindio");


        portal.setDescripcion("\"El Centro Comercial Portal del Quindio, ubicado en el norte de Armenia, es el centro comercial, más grande e importante del Quindío. Cuenta con 100 locales donde se encuentran representadas las marcas comerciales nacionales e internacionales más importantes.\n" +
                "En su mall de comidas rápidas encontrará reconocidos restaurantes como Frisby, hamburguesas El Corral y Presto entre otras.\n" +
                "Todo esta oferta se complementa con una espectacular diverzona y cuatro (4) modernas salas de Cinecolombia.");

        unicentro.setDescripcion("\"Unicentro Armenia inaugurado en Septiembre de 2.012,  ubicado en la  esquina de la Avenida Bolívar con la Calle 4B donde antiguamente funcionó la fabrica de Bavaria, a pocos minutos del Centro de Armenia.El centro comercial cuenta con 40 mil metros cuadrados, 129 locales comerciales y 410 parqueaderos.\n" +
                "Entre las marcas comerciales que ya confirmarón su presencia en Unicentro Armenia, se destacan: Almacenes Exito, Pepe Ganga, Recreatec, Arturo Calle, entre otros.");

        armenia.setDescripcion("Calima Armenia nace de la necesidad de la ciudad y la región de abrir nuevos espacios comerciales para atender un mercado creciente. Un proyecto con sentido ambiental, hace énfasis en su diseño bioclimático de arquitectura abierta que optimiza el uso de la energía. Calima, un verdadero modelo de sostenimiento, será desarrollado en amplios espacios para atender necesidades comerciales, de servicios, entretenimiento y parqueo.");
        parque.setDescripcion("El Parque del Café  brinda a sus visitantes diversión y entretenimiento a través de la cultura cafetera, dando a conocer la importancia del café y del gremio cafetero en el desarrollo económico del país, en un ambiente de naturaleza, con innovadoras, confiables y seguras atracciones  culturales y mecánicas, comprometidos con la conservación del medio ambiente, el bienestar de nuestros empleados y el de la comunidad.");
        panaca.setDescripcion("Somos el primer parque temático agropecuario en el mundo y el más grande en Latinoamérica, te ofrecemos una experiencia única llena de diversión e interacción con el campo, en la que podrás encontrar los Shows más sorprendentes, las más impresionantes Estaciones temáticas y la colección de zoología doméstica más grande del mundo, donde vivirás una experiencia inigualable entre los animales, la naturaleza y el hombre.");
        satelo.setDescripcion("Salento es un municipio colombiano en el departamento del Quindío. Llamado el padre del Quindío por ser el municipio más antiguo de este departamento, es conocido como el municipio Cuna del árbol Nacional \"La Palma de Cera\", posee una gran variedad de atractivos turísticos entre ellos el Valle de Cocora en donde se puede encontrar un paisaje lleno de naturaleza, como el Barranquero o Momotus momota un ave comúnmente divisada, hacer caminatas ecológicas y disfrutar de los hermosos paisajes de esta localidad.");
        penas_blancas.setDescripcion("\"EL ECOPARQUE PEÑAS BLANCAS ofrece un recorrido lleno de aire, naturaleza y paisaje, el cual nos transporta por los parajes más bellos de nuestra región, entre un bosque lleno de verde que parece infinito al contemplar la hoya del Quindío e inalcanzable al observar\n" +
                "la inmensa mole blanca y rocosa que sobresale en la montaña.");
        mama_lulu.setDescripcion("La Pequeña Granja de Mamá Lulú, es un paraíso ecológico que a través de años de estudio, esfuerzo y dedicación, ha permitido crear un ambiente en donde se integran el hombre y la naturaleza en armonía y cooperación. La propuesta que busca esta granja integral, es generar un cambio de actitud personal hacia la vida y la naturaleza, para no seguirla agrediendo, no seguir acabando con nuestros recursos y destruir todo a nuestro paso.");
        arrieros.setDescripcion("EL Parque Los Arrieros es un lugar que ofrece servicios turísticos de recreación, esparcimiento y aprendizaje; en torno a la cultura de la arriería; a través de escenarios artísticos, culturales y áreas de entretenimiento que conforman un abanicó de opciones para que los visitantes, disfruten de una agradable experiencia en nuestras instalaciones.");


        portal.setLatitud((float) 4.545695136892776);
        unicentro.setLatitud((float) 4.537481262607865);
        armenia.setLatitud((float) 4.5268715367044985);
        parque.setLatitud((float) 4.569482343671689);
        panaca.setLatitud((float) 4.622357223916545);
        satelo.setLatitud((float) 4.621929466163072);
        penas_blancas.setLatitud((float) 4.62470988694496);
        mama_lulu.setLatitud((float) 4.640840820686086);
        arrieros.setLatitud((float) 4.531577482735009);

        portal.setLongitud((float) -75.67256734597161);
        unicentro.setLongitud((float) -75.66655919777826);
        armenia.setLongitud((float) -75.68767354714349);
        parque.setLongitud((float) -75.74745929865719);
        panaca.setLongitud((float) -75.76650045717768);
        satelo.setLongitud((float) -75.76083563173823);
        penas_blancas.setLongitud((float) -75.7556428750854);
        mama_lulu.setLongitud((float) -75.56895314786989);
        arrieros.setLongitud((float) -75.57004748914797);


        portal.setLugar("sitio");
        unicentro.setLugar("sitio");
        armenia.setLugar("sitio");
        parque.setLugar("sitio");
        panaca.setLugar("sitio");
        satelo.setLugar("sitio");
        penas_blancas.setLugar("sitio");
        mama_lulu.setLugar("sitio");
        arrieros.setLugar("sitio");



    }

    public static Sitio[] listaSitios ={
            portal,unicentro,armenia ,parque, panaca, satelo, penas_blancas, mama_lulu, arrieros
    };


    public static Sitio bolivar = new Sitio();
    public static Sitio allure = new Sitio();
    public static Sitio armeniaH = new Sitio();
    public static Sitio zuldemayda = new Sitio();
    public static Sitio decameron = new Sitio();
    public static Sitio heliconias = new Sitio();
    public static Sitio arrayanes = new Sitio();
    public static Sitio esperanza = new Sitio();




    public void inputHoteles(){
        bolivar.setImagen(R.drawable.bolivar_plaza);
        allure.setImagen(R.drawable.mocawa);
        armeniaH.setImagen(R.drawable.armenia);
        zuldemayda.setImagen(R.drawable.zuldemayda);
        decameron.setImagen(R.drawable.decameron);
        heliconias.setImagen(R.drawable.heliconias);
        arrayanes.setImagen(R.drawable.arrayanes);
        esperanza.setImagen(R.drawable.la_esperanza);

        bolivar.setNombre("Hotel Bolivar Plaza");
        allure.setNombre("Allure Aroma Mocawa Hotel\n");
        armeniaH.setNombre("Armenia Hotel");
        zuldemayda.setNombre("Hotel Zuldemayda");
        decameron.setNombre("Hotel Decameron Panaca\n");
        heliconias.setNombre("Decameron Las Heliconias\n");
        arrayanes.setNombre("Hotel Arrayanes del Quindio");
        esperanza.setNombre("Finca Hotel La Esperanza");

        bolivar.setDescripcionc("Categoría del hotel:3,5 estrella(s), Cantidad de habitaciones: 18 \n");
        allure.setDescripcionc("\" Categoría del hotel:3,5 estrella(s),\n" +
                "Cantidad de habitaciones: 97 \"\n");
        armeniaH.setDescripcionc("\" Categoría del hotel:3 estrella(s),\n" +
                "Cantidad de habitaciones: 129 \"\n");
        zuldemayda.setDescripcionc("Hotel central, Cantidad de habitaciones: 27 \n");
        decameron.setDescripcionc("\" Categoría del hotel:3,5 estrella(s),\n" +
                "Cantidad de habitaciones: 34 \"\n");
        heliconias.setDescripcionc(" Hotel campestre, Cantidad de habitaciones: 100 \n");
        arrayanes.setDescripcionc("\" Categoría del hotel:3 estrella(s),\n" +
                "Cantidad de habitaciones: 20 \"\n");
        esperanza.setDescripcionc("Hotel campestre,  Cantidad de habitaciones: 39 \n");

        bolivar.setUbicacion("Dirección: Calle 21a No. 14-17, Armenia\n");
        allure.setUbicacion("Dirección: Carrera 14 No. 9N-00, Armenia\n");
        armeniaH.setUbicacion("Dirección: Avenida Bolivar 8\n");
        zuldemayda.setUbicacion("Dirección: Calle 20 15-38 Armenia\n");
        decameron.setUbicacion("Dirección: Km. 7 Vereda Kerman | Parque Nacional de la Cultura Agropecuaria, Quimbaya, Colombia \n");
        heliconias.setUbicacion("Dirección: Km 2 Vía a Panaca, Vereda Kerman, Quimbaya \n");
        arrayanes.setUbicacion("Dirección: Km 1 Vía Montenegro-Parque del Cafe, Montenegro\n");
        esperanza.setUbicacion("Dirección: Vereda la esperanza, Montenegro, Colombia \n");

        bolivar.setDescripcion("Hotel sencillo, sin mayores pretensiones pero bien ubicado, cerca del centro de armenia, con facilidad de acceso para visitantes de negocios. Adecuado para pasar una o dos noches, es acogedor y el servicio es muy bueno. Dirección Calle 21a No. 14-17, Armenia\n");
        allure.setDescripcion("Disfruta de un hotel de excelente calidad y con un sello personal que lo hace ser único. Con una atención cinco estrellas, lo hace una de las mejores alternativas en hospedaje es Armenia. Con una perfecta ubicación y contar con un buen restaurante y un centro comercial, Dirección Carrera 14 No. 9N-00, Armenia\n");
        armeniaH.setDescripcion("Una excelente opción en Armenia, el hotel es amplio y muy bien atendido por todo el personal. Las habitaciones son bastante cómodas y muy bien dotadas par tener una agradable estadía. La estadía incluye un desayuno tipo bufete que está muy bien balanceado y ofrece gran variedad.  Dirección: Avenida Bolivar 8\n");
        zuldemayda.setDescripcion("Hotel ubicado en el centro de la cuidad de Armenia (dos cuadras del parque principal), confortable, elegante, la atención es espectacular, wifi muy rapido, desayuno incluido, precios especiales los fines de semana. En la recepción lo asesoran en planes de recreación en todo el eje cafetero. Dirección: Calle 20 15-38 Armenia\n");
        decameron.setDescripcion("Este hotel no solamente cuenta con una ambientación increíble sino además es parte de la naturaleza de Armenia. La atención es muy buena, la comida excelente y además entrada a panaca ilimitada, Dirección: Km. 7 Vereda Kerman | Parque Nacional de la Cultura Agropecuaria, Quimbaya, Colombia \n");
        heliconias.setDescripcion("Decameron Las HeliconiasEste excelente hotel, ubicado muy cerca de Panaca, como hotel, tienen una calificación de excelente, acceso al parque Panaca incluido y al Parque Nacional del Café, esto es muy bueno, además que cuenta con trasporte entre hoteles y parque, la comida buena, snack buenos, instalaciones excelentes, Dirección: Km 2 Vía a Panaca, Vereda Kerman, Quimbaya \n");
        arrayanes.setDescripcion("Lugar estupendo para una estancia tranquila, relajada, con un ambiente sobrio y además muy bien ubicado para desplazamientos hacia los sitios turísticos o parques temáticos. Además el desayuno es estupendo, y el sitio se presta para leer en un super ambiente, Dirección: Km 1 Vía Montenegro-Parque del Cafe, Montenegro\n");
        esperanza.setDescripcion("Una gran estadía con familia en un lugar donde se respira naturaleza y está cerca de los atractivos turísticos de la región. Una experiencia de servicio magnífica donde cada uno de las personas que trabajan allí hacen todo por que la experiencia sea magnífica, Dirección: Vereda la esperanza, Montenegro, Colombia \n");

        bolivar.setLatitud((float) 4.45234778794663);
        allure.setLatitud((float) 4.447555758701706);
        armeniaH.setLatitud((float) 4.624838213794354);
        zuldemayda.setLatitud((float) 4.637932138866702);
        decameron.setLatitud((float) 4.622357223916545);
        heliconias.setLatitud((float) 4.621929466163072);
        arrayanes.setLatitud((float) 4.5659102936329115);
        esperanza.setLatitud((float) 4.566295305869581);

        bolivar.setLongitud((float) -75.78196047823484);
        allure.setLongitud((float) -75.78938483278806);
        armeniaH.setLongitud((float) -75.762595160852);
        zuldemayda.setLongitud((float) -75.57060538862306);
        decameron.setLongitud((float) -75.76650045717768);
        heliconias.setLongitud((float) -75.76083563173823);
        arrayanes.setLongitud((float) -75.75595653681637);
        esperanza.setLongitud((float) -75.75057066111447);

        bolivar.setLugar("hotel");
        allure.setLugar("hotel");
        armeniaH.setLugar("hotel");
        zuldemayda.setLugar("hotel");
        decameron.setLugar("hotel");
        heliconias.setLugar("hotel");
        arrayanes.setLugar("hotel");
        esperanza.setLugar("hotel");
    }

    public static Sitio[] listaHoteles ={
            bolivar,allure,armeniaH ,zuldemayda, decameron, heliconias, arrayanes, esperanza
    };


    public static Sitio roble = new Sitio();
    public static Sitio fogata = new Sitio();
    public static Sitio papaya = new Sitio();
    public static Sitio verde = new Sitio();
    public static Sitio camelia = new Sitio();
    public static Sitio cocora = new Sitio();
    public static Sitio solar = new Sitio();

    public void inputRes() {
        roble.setImagen(R.drawable.el_roble);
        fogata.setImagen(R.drawable.la_fogata);
        papaya.setImagen(R.drawable.dar_papaya);
        verde.setImagen(R.drawable.casa_verde);
        camelia.setImagen(R.drawable.camelia_real);
        cocora.setImagen(R.drawable.bosque_cocora);
        solar.setImagen(R.drawable.el_solar);

        roble.setNombre("El Roble\n");
        fogata.setNombre("La Fogata\n");
        papaya.setNombre("Dar Papaya");
        verde.setNombre("Casa Verde\n");
        camelia.setNombre("Camelia Real\n");
        cocora.setNombre("Bosques de Cocora donde Juan B\n");
        solar.setNombre("El Solar\n");

        roble.setDescripcionc("En el Restaurante El Roble encontrarás comida típica de la región con la mejor sazón\n");
        fogata.setDescripcionc("El Restaurante La Fogata ubicado en la ciudad de Armenia Colombia, es catalogado como el mejor restaurante del Triángulo del Café \n");
        papaya.setDescripcionc("Este es uno de los restaurantes del Quindio más nuevos y exitosos.\n");
        verde.setDescripcionc("Casa Verde Campestre cuenta con un salón principal con capacidad para 200 personas\n");
        camelia.setDescripcionc("Restaurante de hotel campestre \n");
        cocora.setDescripcionc("Bosques de Cocora donde Juan B\nEl sitio está ubicado en pleno Valle del Cocora a 10 Km. del Municipio de Salento\n");
        solar.setDescripcionc("El Solar\nCreado hace 10 años, inició como un juego empresarial con un salón con cocina y parrilla con capacidad para 80 personas.\n");

        roble.setUbicacion("Dirección: Vía Armenia – Pereira\n");
        fogata.setUbicacion("ubicado en el norte de Armenia. Quindio.\n");
        papaya.setUbicacion("Dirección: Av Centenario (Frente al CC Calima). Armenia, Quindío.\n");
        verde.setUbicacion("Dirección:  Vía Armenia – Cali.\n");
        camelia.setUbicacion("Dirección: Vía Montenegro – Pueblo Tapao\n");
        cocora.setUbicacion("Dirección: Valle de Cocora, Salento, Quindio\n");
        solar.setUbicacion("Dirección: Vía Armenia – Pereira\n");

        roble.setNombre("En el Restaurante El Roble encontrarás comida típica de la región con la mejor sazón, y espacios para el esparcimiento familiar en nuestro Café Rockola y Parque Recreativo y Granja. El Roble es reconocido por su tradición gastronómica, sus amplios y verdes espacios para el entretenimiento familiar y su excelente ubicación, donde podrás vivir y sentir el paisaje cultural cafetero, apreciar el municipio de Salento y el nevado del Tolima. En el Restaurante El Roble encontrarás comida típica de la región con la mejor sazón, y espacios para el esparcimiento familiar en nuestro Café Rockola y Parque Recreativo y Granja.\n");
        fogata.setNombre("El Restaurante La Fogata ubicado en la ciudad de Armenia Colombia, es catalogado como el mejor restaurante del Triángulo del Café por diferentes medios especializados en gastronomía; El único sitio donde se destaca la constancia, la buena atención, el buen sabor y fidelidad de todos sus comensales. La Fogata está situada en el sector más dinámico de Armenia y por su ubicación se convierte en una bella isla urbana donde se disfrutan las más exquisitas sensaciones.\n");
        papaya.setNombre("\"\n" +
                "Este es uno de los restaurantes del Quindio más nuevos y exitosos. Está localizado en la ciudad milagro de Colombia. Presenta a sus comensales una hermosa vista de las montañas de la Cordillera Central de Colombia y del cañón creado por la cuenca del Río Quindio y sus alrededores.\"\n");
        verde.setNombre("Casa Verde Campestre cuenta con un salón principal con capacidad para 200 personas, áreas ecológicas con plantas florales y frutales, parqueadero amplio, senderos naturales y zona de camping.\n");
        camelia.setNombre("Ubicado al interior del Hotel Campestre las Camelias, tiene capacidad para 250 personas, ofrece una variedad de platos y comida Típica, Nacional e Internacional. \n");
        cocora.setNombre("El sitio está ubicado en pleno Valle del Cocora a 10 Km. del Municipio de Salento, es atendido directamente por sus propietarios lo que complementa la excelencia en el servicio, ya que consideramos que esto garantiza el calor humano que requiere este tipo de establecimientos. El Valle del Cocora es reconocido a nivel mundial y nacional por su hermoso paisaje, por sus palmas de Cera que miden más 60 metros (las más altas del mundo) y declaradas el árbol Nacional de Colombia. Allí es la cuna del nacimiento del Río Quindío y es una de las entradas al Parque Natural de los Nevados.\n");
        solar.setNombre("\"Creado hace 10 años, inició como un juego empresarial con un salón con cocina y parrilla con capacidad para 80 personas.\n" +
                "\n" +
                "El Restaurante El Solar abrió sus puertas a principios del año 2001, desde entonces ha crecido en su planta física y oferta gastronómica para brindarle a sus clientes una experiencia inolvidable. \"\n");

        roble.setLatitud((float) 4.545695136892776);
        fogata.setLatitud((float) 4.537481262607865);
        papaya.setLatitud((float) 4.5268715367044985);
        verde.setLatitud((float) 4.518144064907527);
        camelia.setLatitud((float) 4.566295305869581);
        cocora.setLatitud((float) 4.637932138866702);
        solar.setLatitud((float) 4.640840820686086);

        roble.setLongitud((float) -75.67256734597161);
        fogata.setLongitud((float) -75.66655919777826);
        papaya.setLongitud((float) -75.68767354714349);
        verde.setLongitud((float) -75.71059034096673);
        camelia.setLongitud((float) -75.75057066111447);
        cocora.setLongitud((float) -75.57060538862306);
        solar.setLongitud((float) -75.56895314786989);

        roble.setLugar("restaurante");
        fogata.setNombre("restaurante");
        papaya.setNombre("restaurante");
        verde.setNombre("restaurante");
        camelia.setNombre("restaurante");
        cocora.setNombre("restaurante");
        solar.setNombre("restaurante");

    }

    public static Sitio[] listaRestaurantes ={
            roble,fogata,papaya ,verde, camelia, cocora, solar
    };

}
