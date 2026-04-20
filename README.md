<img width="465" height="790" alt="Ekran görüntüsü 2026-04-20 162223" src="https://github.com/user-attachments/assets/6515f7b1-f892-4cc0-9db5-ad1fca8241c3" />
<img width="396" height="794" alt="Ekran görüntüsü 2026-04-20 161943" src="https://github.com/user-attachments/assets/ee3585d2-d55d-431f-a43b-f1086a225767" />
<img width="480" height="858" alt="Ekran görüntüsü 2026-04-20 161857" src="https://github.com/user-attachments/assets/d083c481-5eb4-4a4c-b899-ebb27f4c661a" />
User List Application (MVVM & Retrofit)
Bu proje, modern Android geliştirme teknikleri kullanılarak hazırlanmış, JSONPlaceholder API'sinden kullanıcı verilerini çeken ve listeleyen bir Android uygulamasıdır.

🛠 Kullanılan Teknolojiler ve Kütüphaneler
Kotlin: Uygulamanın temel programlama dili.

Jetpack Compose: Modern ve deklaratif UI tasarımı.

MVVM (Model-View-ViewModel): Temiz kod ve sürdürülebilirlik için mimari yapı.

Retrofit & Gson: REST API entegrasyonu ve JSON verilerinin işlenmesi.

Coroutines & Flow: Asenkron veri akışı ve thread yönetimi.

Lifecycle & ViewModel: Konfigürasyon değişikliklerinde veri kaybını önleme ve UI state yönetimi.

🏗 Proje Yapısı
Proje, sorumlulukların ayrılması prensibine uygun olarak şu paket yapısıyla kurulmuştur:

data: Veri modelleri, API servis tanımları ve repository katmanı.

uipackage: Jetpack Compose ekranları, UI bileşenleri (UserItem) ve ViewModel sınıfları.

🚀 Kurulum Adımları
Bu repository'yi bilgisayarınıza clone'layın:

Bash
git clone https://github.com/tugceincmn/UserListApplication.git
Android Studio'yu açın ve projeyi içe aktarın (Import Project).

build.gradle.kts dosyasındaki bağımlılıkların yüklenmesi için "Sync Now" butonuna tıklayın.

İnternet erişimi için AndroidManifest.xml dosyasında gerekli izinlerin verildiğinden emin olun.

Uygulamayı bir emülatör veya fiziksel cihaz üzerinde çalıştırın.

📱 Uygulama Özellikleri
Loading State: Veriler çekilirken kullanıcıya bir yükleme göstergesi sunulur.

Success State: Başarıyla çekilen veriler, dairesel profil ikonları ve iletişim bilgileriyle listelenir.

Error State: Bağlantı hatalarında kullanıcıya bilgilendirme yapılır ve tekrar deneme butonu gösterilir.
