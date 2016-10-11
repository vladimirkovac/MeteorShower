package com.example.kovac94.meteorshower;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by kovac94 on 11/10/2016.
 */

public class Rocket {


}

/*
import math,time,random
        import pygame,sys
        from pygame.locals import *

        pygame.init()

        clock = pygame.time.Clock()

        WIDTH=1000
        HEIGHT=560

        screen = pygame.display.set_mode((WIDTH, HEIGHT))

        running = True

        backgroundImg = pygame.image.load("back.png")

class Rocket(pygame.sprite.Sprite):

        def __init__(self,x,y,radius):
        pygame.sprite.Sprite.__init__(self)

        self.x=x
        self.y=y
        self.radius=radius
        self.color=(10,20,80)
        self.destinationPoint = None
        self.speed = 10

        def move(self):

        if self.destinationPoint!=None:

        disX=self.destinationPoint[0]-self.x
        disY=self.destinationPoint[1]-self.y

        if math.sqrt(disY*disY+disX*disX)<self.speed:
        self.x=self.destinationPoint[0]
        self.y=self.destinationPoint[1]

        else:
        radian=math.atan2(disY,disX)
        self.x+=math.cos(radian)*self.speed
        self.y+=math.sin(radian)*self.speed

        def draw(self,screen): pygame.draw.circle(screen, self.color, self.x, self.y, self.radius)

class Meteor(Rocket):

        def __init__(self):
        self.x=random.randint(10, WIDTH-10)
        self.y=-20
        self.destinationPoint = (random.randint(10, WIDTH-10),HEIGHT)
        self.radius=20
        self.color=(200,20,80)
        self.speed = 5

        r = Rocket(WIDTH/2,HEIGHT-20,5)


        meteors = [Meteor()]

        while running:

        #screen.fill((0,0,0))
        screen.blit(backgroundImg,(0,0))

        clock.tick(60)

        for event in pygame.event.get():
        if event.type == QUIT:
        running = False

        if event.type == pygame.MOUSEBUTTONUP:
        pos=pygame.mouse.get_pos()

        if r.destinationPoint==None:
        r.destinationPoint = pos

        if r.destinationPoint!=None:

        if r.x == r.destinationPoint[0] and r.y == r.destinationPoint[1]: r = Rocket(WIDTH/2,HEIGHT-20,5)

        r.move()
        pygame.draw.circle(screen, r.color, (int(r.x), int(r.y)), r.radius)


        for meteor in meteors:

        meteor.move()
        pygame.draw.circle(screen, meteor.color, (int(meteor.x), int(meteor.y)), meteor.radius)

        if meteor.destinationPoint!=None:
        if meteor.x == meteor.destinationPoint[0] and meteor.y == meteor.destinationPoint[1]:
        meteors.remove(meteor)
        meteors.append(Meteor())

        #check if two circle collide (x2-x1)^2 + (y1-y2)^2 <= (r1+r2)^2 collide
        if (meteor.x-r.x)*(meteor.x-r.x) + (meteor.y-r.y)*(meteor.y-r.y) <= (meteor.radius+r.radius)*(meteor.radius+r.radius):
        meteors.remove(meteor)
        meteors.append(Meteor())
        r = Rocket(WIDTH/2,HEIGHT-20,5)

        pygame.display.flip()
*/





