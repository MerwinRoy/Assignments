import {Component, HostBinding, Input, OnInit, ViewChild} from '@angular/core';
import { ModalComponent } from '../components/modal/modal.component';
import {ModalConfig} from "../components/modal/modal.config";
import {Product} from '../product.model';

@Component({
  selector: 'app-product-image',
  templateUrl: './product-image.component.html',
  styleUrls: ['./product-image.component.css']
})
export class ProductImageComponent implements OnInit {

  @Input() product: Product;
  @ViewChild('modal') private modal: ModalComponent

  @HostBinding('attr.class') cssClass = 'ui small image';

  public modalConfig: ModalConfig = {
    modalTitle: "Expanded View",
    onDismiss: () => {
      return true
    },
    dismissButtonLabel: "Dismiss",
    onClose: () => {
      return true
    },
    closeButtonLabel: "Close"
  }

  constructor() { }

  ngOnInit() {
  }

  async openModal() {
    return await this.modal.open()
  }

}
