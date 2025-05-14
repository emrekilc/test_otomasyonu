from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from pathlib import Path
import time

# Masaüstü yolu otomatik
desktop = str(Path.home() / "Desktop")
screenshot_path = desktop + "/test-sonucu.png"

driver = webdriver.Chrome()

try:
    driver.get("https://the-internet.herokuapp.com/login")
    driver.find_element(By.ID, "username").send_keys("wronguser")
    driver.find_element(By.ID, "password").send_keys("wrongpassword", Keys.RETURN)

    time.sleep(2)

    # Hata mesajını kontrol et
    error = driver.find_element(By.ID, "flash").text
    assert "invalid" in error.lower() or "your username" in error.lower()

    # Ekran görüntüsü al ve sonucu bildir
    success = driver.save_screenshot(screenshot_path)
    print("Ekran görüntüsü kaydedildi mi? :", success)
    print("Kayıt Yolu:", screenshot_path)

    input("İncelemek için bir tuşa bas...")
finally:
    driver.quit()




