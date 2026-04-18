Giảp pháp 1: hidden input
    Bước 1: -> submit -> gửi Data sag bước 2
    Bước 2: -> gửi sang bước 3
    Dùng hidden input để gửi dữ liệu

Giải pháp 2: Dùng @SessionAttributes
    Ý tưởng:
        Lưu object vào session
        Dữ liệu sống xuyên suốt session


So sách:
    Tiêu chí        Hidden Input            SessionAttributes
    Bảo mật         thấp (F12 sửa đc)       cao
    Code            đơn giản                phức tạp hơn
    Ram server      không tốn               có nguy cơ phình 
    Data lớn        không phù hợp           phù hợp

    -> Chọn @SessionAttributes

