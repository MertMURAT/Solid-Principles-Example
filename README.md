# Solid-Principles-Assignment
Etstur 1. Hafta

 Solid Prensipleri

1. (S)ingle Responsibility Principle

Her sınıfın ve her methodun kendine ait bir işi ve sorumluluğu olmalı prensibinden yola çıkarak
başlangıç olarak Vehicle ve DBOperations adında iki adet sınıf oluşturdum.
Vehicle sınıfına araçların detaylarını ve tutarına ilişkin iki adet method tanımladım.
DBOperations sınıfına ise araç verilerini ekleyen ve silen iki method tanımladım.Böylece 
her sınıf ve her method bir işi yap ve onu en iyi şekilde yap metadolojisiyle uygulanmış oldu.
Bu sayede proje genişleyebilir, tekrar kullanılabilir ve test edilebilir bir yapı kurmaya elverişli olmuştur.

2. (O)pen/Closed Principle

Bu prensipte ise Car, Truck, Vehicle ve VehicleCalculation adında 4 adet sınıf oluşturdum.
Car ve Truck sınıfları Vehicle sınıfından aldığı değerleri belirli bir değer ile çarpıp bir fiyat belirlemektedir.
Prensip ilkesine dayanarak kullandığım class ve metodları gelişime açık fakat kodların değişimine kapalı olması gerekmektedir.
Bu sebepten oluşturduğum diğer sınıf olan VehicleCalculation sınıfıyla diğer sınıf ve metodların kodlarına dokunmadan 
araçların fiyatlarını güncelledim.


3. (L)iskov ‘s Substitution Principle

Liskov ikame prensibi olarakta adlandırılan bu prensipte ise başlangıçta Bus ve Car adında iki adet sınıf tanımlayıp sınıfları
Vehicle sınıfından kendi araç tipine has olan özellikleri override edilerek almalarını sağladım. Bu yapıya yeni araçlar ve yeni özellikler
eklemek istiyorum.Bu yüzden Bike adında bir araç sınıfı oluşturdum fakat özellik eklemek istediğim Bike aracını ve diğer araçları üst sınıf olan 
Vehicle sınıfını ve alt sınıf olan araç sınıflarının kodlarını değiştirmeden motorlu ve motorsuz olarak iki kategoriye ayırarak türettiğim iki 
alt sınıf, üst sınıf olan Vehicle sınıfının özelliklerini de kullanmış oldu ve kendine has özellikleri de kolayca tanımlayabildi.

4. (I)nterface Segregation Principle

"Arayüz Ayırımı" tabiriyle tanımladığımız prensipte ise tanımladığım araç sınıflarına Vehicle sınıfından gerekenden fazla metot ve değişken eklemek
yerine, yeni bir özelliştirilmiş interface oluşturdum.Bu prensip Single Responsibility prensibiyle oldukça benzer ve aynı amaca hizmet etmektedirler.
Ancak Single Responsibiliy prensibi classlarla ilgilenirken Interface Segregation prensibi interface' ler ile ilgilenmektedir.

5. (D)ependency Inversion Principle

