from tkinter import *
from tkinter import ttk
window = Tk()
class Person:
    def_init(self,lbl)

    self=Label(window,text = "Enter your fullname: ", fg= "red")
    self.place(x=50,y=100)

    self = Entry(window,text = "This is a text field", bd = 5)
    self.place(x=290,y=100)

    self=Button(window,text = "Click to display your Fullname", fg = "red", font =("Verdana",9))
    self.place(x=50,y=150)

    self = Entry(window,text = "This is a text field", bd = 5)
    seld.place(x=290,y=150)

    def display(self):
        fname=str(self.t1.get())
        result= fname
        self.t2.insert(END, str(result))


window.geometry("500x300+20+10")
window.title("Midterm in OOP")
window.mainloop()