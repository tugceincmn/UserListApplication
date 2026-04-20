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
