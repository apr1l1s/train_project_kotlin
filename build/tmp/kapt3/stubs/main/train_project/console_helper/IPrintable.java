package train_project.console_helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Ltrain_project/console_helper/IPrintable;", "T", "", "printError", "", "e", "Ltrain_project/errors/ErrorTypes;", "printItem", "item", "(Ljava/lang/Object;)V", "printNotify", "s", "", "untitled1"})
public abstract interface IPrintable<T extends java.lang.Object> {
    
    public abstract void printError(@org.jetbrains.annotations.NotNull()
    train_project.errors.ErrorTypes e);
    
    public abstract void printItem(T item);
    
    public abstract void printNotify(@org.jetbrains.annotations.NotNull()
    java.lang.String s);
}