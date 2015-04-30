package models.web

import models.data.Photo

/**
 * User: le
 * Date: 21.09.13
 */
case class PhotoWeb(linkA: String,
                    linkB: String,
                    categoryId: Int)

object PhotoWeb {

  def convertWebToObject(photoWeb: PhotoWeb): Photo = {
    Photo(photoWeb.linkA, photoWeb.linkB,photoWeb.categoryId)
  }

  def convertObjectToWeb(photo: Photo): PhotoWeb = {
    PhotoWeb(photo.linkA, photo.linkB,photo.categoryId)
  }



}