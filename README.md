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

4. (I)nterface Segregation Principle

5. (D)ependency Inversion Principle

