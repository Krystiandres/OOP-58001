from tkinter import *

class Name:
    def __init__(self, window):
        self=Label(window,text = "Enter your fullname: ", fg= "red")
        self.place(x=50,y=100)

        self = Entry(window,text = "This is a text field", bd = 5)
        self.place(x=290,y=100)

        self=Button(window,text = "Click to display your Fullname", fg = "red", font =("Verdana",9))
        self.place(x=50,y=150)

        self = Entry(window,text = "This is a text field", bd = 5)
        self.place(x=290,y=150)

    def display(self):
        fwindow=str(self.t1.get())
        result= fwindow
        self.t2.insert(END, str(result))

window=Tk()
myname=Name(window)
window.title('TEMPERATURE UNIT CONVERTION')
window.geometry("550x300+10+10")
window.mainloop()