import sqlite3

class Test:
    con = sqlite3. connect("TestDB.db3")


    Cur = con.cursor()


    def Insert_Data(self, data1, data2, data3):
        try:
            sp1 = "INSERT INTO TsetTABLE VALUES(?, ?, ?)"
            data = (data1, data2, data3)
            self.Cur.execute(sp1, data)
        except Exception as e:
            print('error', e)
        finally:
            self.con.commit()

if __name__ == '__main__':
    SQL = Test()
    SQL.Insert_Data("1", "You", "010-1111-0000")