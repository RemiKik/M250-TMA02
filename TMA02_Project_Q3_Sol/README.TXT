SneakyHoverFrog shf1 = new SneakyHoverFrog();
Toad t2 = new Toad();
shf1.setColour(OUColour.BLUE);
shf1.startSneaking();
shf1.setColour(OUColour.BLUE);
shf1.stopSneaking();
shf1.startSneaking();
shf1.panicIfCanBeSeen(t2);
t2.setPosition(1);
shf1.panicIfCanBeSeen(t2);
shf1.startSneaking();
shf1.upBy(4);
shf1.panicIfCanBeSeen(t2);
shf1.downBy(1);
shf1.panicIfCanBeSeen(t2);
