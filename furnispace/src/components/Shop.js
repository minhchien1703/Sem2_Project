

function Shop() {
    return (
        <>
            <div className="wrapper">
                <main className="main-content">
                    {/*== Start Page Header Area Wrapper ==*/}
                    <div className="page-header-area">
                        <div
                            className="page-header-content bg-img"
                            data-bg-img="%PUBLIC_URL%/assets/images/photos/bg1.jpg"
                        >
                            <ol className="breadcrumb">
                                <li className="breadcrumb-item">
                                    <a href="index.html">Home</a>
                                </li>
                                <li className="breadcrumb-item active" aria-current="page">
                                    Products
                                </li>
                            </ol>
                        </div>
                    </div>
                    {/*== End Page Header Area Wrapper ==*/}
                    {/*== Start Product Area Wrapper ==*/}
                    <div className="product-area section-space">
                        <div className="container">
                            {/*== Start Product Top Bar Area Wrapper ==*/}
                            <div className="shop-top-bar">
                                <div className="shop-top-bar-item">
                                    <label htmlFor="SortBy">Sort by :</label>
                                    <select className="select-shoing" name="SortBy" id="SortBy">
                                        <option value="title-ascending">Alphabetically, A-Z</option>
                                        <option value="manual">Featured</option>
                                        <option value="best-selling">Best Selling</option>
                                        <option value="title-descending">Alphabetically, Z-A</option>
                                        <option value="price-ascending">Price, low to high</option>
                                        <option value="price-descending">Price, high to low</option>
                                        <option value="created-descending">Date, new to old</option>
                                        <option value="created-ascending">Date, old to new</option>
                                    </select>
                                </div>
                                <div className="shop-top-bar-item">
                                    <p>Showing 1 - 12 of 25 result</p>
                                </div>
                                <div className="shop-top-bar-item">
                                    <label htmlFor="paginateBy">Show :</label>
                                    <select
                                        className="select-shoing-count"
                                        name="paginateBy"
                                        id="paginateBy"
                                    >
                                        <option value={3}>3</option>
                                        <option value={4}>4</option>
                                        <option value={5}>5</option>
                                        <option value={6}>6</option>
                                        <option value={7}>7</option>
                                        <option value={8}>8</option>
                                        <option value={9}>9</option>
                                        <option value={10}>10</option>
                                        <option value={11}>11</option>
                                        <option value={12} selected="">
                                            12
                                        </option>
                                        <option value={13}>13</option>
                                    </select>
                                </div>
                                <div className="shop-top-bar-item">
                                    <div className="nav list-grid-toggle">
                                        <button
                                            className="nav-link active"
                                            data-bs-toggle="tab"
                                            data-bs-target="#column-three"
                                        >
                                            <i className="icon-grid icons" />
                                        </button>
                                        <button
                                            className="nav-link mr-0"
                                            data-bs-toggle="tab"
                                            data-bs-target="#nav-list"
                                        >
                                            <i className="icon-menu icons" />
                                        </button>
                                    </div>
                                </div>
                            </div>
                            {/*== End Product Top Bar Area Wrapper ==*/}
                            <div className="tab-content" id="nav-tabContent">
                                <div className="tab-pane fade show active" id="column-three">
                                    <div className="row">
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/1.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-15%</span>
                                                    <span className="label label-new">New</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            1. New and sale badge product
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$130.00</span> $110.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem1-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item1"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item1-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/2.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item2"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item2-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/3.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item3"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item3-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem1-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item1-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item1"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item1"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/2.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item2-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item2"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item2"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/3.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item3-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item3"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item3"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                    </div>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-10%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            10. This is the large title
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$21.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem2-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item4"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item4-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/3.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item5"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item5-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item6"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item6-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/5.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem2-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item4-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item4"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item4"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/3.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item5-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item5"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item5"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item6-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item6"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item6"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/5.jpg"
                                                        />
                                                    </div>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            11. Product with video
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price"> $39.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <div
                                                        className="tab-content product-item-tab-content"
                                                        id="productItem3-tabContent"
                                                    >
                                                        <div
                                                            className="tab-pane fade show active"
                                                            id="product-item7"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item7-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/4.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item8"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item8-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/5.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                        <div
                                                            className="tab-pane fade"
                                                            id="product-item9"
                                                            role="tabpanel"
                                                            aria-labelledby="product-item9-tab"
                                                        >
                                                            <a
                                                                className="product-item-thumb"
                                                                href="shop-single-product.html"
                                                            >
                                                                <img
                                                                    src="assets/images/shop/6.jpg"
                                                                    width={268}
                                                                    height={313}
                                                                    alt="Image-HasTech"
                                                                />
                                                            </a>
                                                        </div>
                                                    </div>
                                                    <div
                                                        className="nav nav-tabs product-item-tab-btn"
                                                        id="productItem3-tab"
                                                        role="tablist"
                                                    >
                                                        <button
                                                            className="nav-link active"
                                                            id="product-item7-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item7"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item7"
                                                            aria-selected="true"
                                                            data-bg-img="assets/images/shop/4.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item8-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item8"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item8"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/5.jpg"
                                                        />
                                                        <button
                                                            className="nav-link"
                                                            id="product-item9-tab"
                                                            data-bs-toggle="tab"
                                                            data-bs-target="#product-item9"
                                                            type="button"
                                                            role="tab"
                                                            aria-controls="product-item9"
                                                            aria-selected="false"
                                                            data-bg-img="assets/images/shop/6.jpg"
                                                        />
                                                    </div>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-11%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            10. This is the large title
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$21.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/5.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label label-new">New</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">2. New badge product</a>
                                                    </h5>
                                                    <div className="product-item-price">$80.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/6.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Sale</span>
                                                    <span className="label label-two">-18%</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">3. Variable product</a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$85.00</span> $70.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/7.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label">Soldout</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                    <div className="countdown1" data-countdown="2025/01/05" />
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">4. Soldout product</a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$29.00</span> $19.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/8.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">5. Simple product</a>
                                                    </h5>
                                                    <div className="product-item-price">$50.00</div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-sm-6 col-lg-4 mb-4">
                                            {/*== Start Product Item ==*/}
                                            <div className="product-item">
                                                <div className="product-item-thumb-wrap">
                                                    <a
                                                        className="product-item-thumb"
                                                        href="shop-single-product.html"
                                                    >
                                                        <img
                                                            src="assets/images/shop/9.jpg"
                                                            width={268}
                                                            height={313}
                                                            alt="Image-HasTech"
                                                        />
                                                    </a>
                                                    <span className="label label-new">New</span>
                                                    <div className="product-item-action">
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-quick-view"
                                                            data-tooltip-text="Quick View"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-QuickViewModal"
                                                        >
                                                            <i className="icon-magnifier" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-wishlist"
                                                            data-tooltip-text="Add to wishlist"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-WishlistModal"
                                                        >
                                                            <i className="icon-heart" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-compare"
                                                            data-tooltip-text="Compare"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CompareModal"
                                                        >
                                                            <i className="icon-refresh" />
                                                        </button>
                                                        <button
                                                            type="button"
                                                            className="product-action-btn action-btn-cart"
                                                            data-tooltip-text="Add to cart"
                                                            data-bs-toggle="modal"
                                                            data-bs-target="#action-CartAddModal"
                                                        >
                                                            <i className="icon-bag" />
                                                        </button>
                                                    </div>
                                                </div>
                                                <div className="product-item-info">
                                                    <h5 className="product-item-title">
                                                        <a href="shop-single-product.html">
                                                            6. Variable with soldout product
                                                        </a>
                                                    </h5>
                                                    <div className="product-item-price">
                                                        <span className="price-old">$75.00</span> $55.00
                                                    </div>
                                                    <div className="product-item-review-icon">
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                        <img
                                                            src="assets/images/icons/star.svg"
                                                            width={17}
                                                            height={17}
                                                            alt="icon-star"
                                                        />
                                                    </div>
                                                </div>
                                            </div>
                                            {/*== End Product Item ==*/}
                                        </div>
                                        <div className="col-12">
                                            <nav className="pagination-area">
                                                <ul className="page-numbers justify-content-center">
                                                    <li>
                                                        <a className="page-number prev" href="shop.html">
                                                            <i className="icon-arrow-left" />
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a className="page-number active" href="shop.html">
                                                            1
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a className="page-number" href="shop.html">
                                                            2
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a className="page-number next" href="shop.html">
                                                            <i className="icon-arrow-right" />
                                                        </a>
                                                    </li>
                                                </ul>
                                            </nav>
                                        </div>
                                    </div>
                                </div>
                                <div className="tab-pane fade" id="nav-list">
                                    <div className="product-list-items">
                                        {/*== Start Product Item ==*/}
                                        <div className="product-two-item mb-4">
                                            <div className="row">
                                                <div className="col-lg-4 col-md-4">
                                                    <div className="product-two-item-thumb-wrap">
                                                        <a
                                                            className="product-two-item-thumb"
                                                            href="shop-single-product.html"
                                                        >
                                                            <img
                                                                src="assets/images/shop/1.jpg"
                                                                width={268}
                                                                height={313}
                                                                alt="Image-HasTech"
                                                            />
                                                        </a>
                                                        <span className="label">Sale</span>
                                                        <span className="label label-two">-15%</span>
                                                        <span className="label label-new">New</span>
                                                        <div className="product-two-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-quick-view"
                                                                data-tooltip-text="Quick View"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-QuickViewModal"
                                                            >
                                                                <i className="icon-magnifier-add" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-8 col-md-8 align-self-center">
                                                    <div className="product-two-item-info">
                                                        <h3 className="product-two-item-title mt-n1">
                                                            <a href="shop-single-product.html">
                                                                1. New and sale badge product
                                                            </a>
                                                        </h3>
                                                        <p className="product-two-item-desc">
                                                            Contrary to popular belief, Lorem Ipsum is not simply
                                                            random text. It has roots in a piece of classical Latin
                                                            literature from 45 BC, making it over 2000 years old.
                                                            Richard McClintock, a Latin professor at Hampden-Sydney
                                                            College in Virginia,
                                                        </p>
                                                        <div className="product-two-item-price">
                                                            $110.00 <span className="price-old">$130.00</span>
                                                        </div>
                                                        <div className="product-two-item-review-icon">
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                        </div>
                                                        <div className="product-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-wishlist"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-WishlistModal"
                                                            >
                                                                <i className="icon-heart" />
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-cart"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CartAddModal"
                                                            >
                                                                <i className="icon-basket-loaded" />{" "}
                                                                <span>Add To Cart</span>
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-compare"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CompareModal"
                                                            >
                                                                <i className="icon-refresh" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        {/*== End Product Item ==*/}
                                        {/*== Start Product Item ==*/}
                                        <div className="product-two-item mb-4">
                                            <div className="row">
                                                <div className="col-lg-4 col-md-4">
                                                    <div className="product-two-item-thumb-wrap">
                                                        <a
                                                            className="product-two-item-thumb"
                                                            href="shop-single-product.html"
                                                        >
                                                            <img
                                                                src="assets/images/shop/2.jpg"
                                                                width={268}
                                                                height={313}
                                                                alt="Image-HasTech"
                                                            />
                                                        </a>
                                                        <span className="label">Sale</span>
                                                        <span className="label label-two">-10%</span>
                                                        <div className="product-two-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-quick-view"
                                                                data-tooltip-text="Quick View"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-QuickViewModal"
                                                            >
                                                                <i className="icon-magnifier-add" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-8 col-md-8 align-self-center">
                                                    <div className="product-two-item-info">
                                                        <h3 className="product-two-item-title mt-n1">
                                                            <a href="shop-single-product.html">
                                                                10. This is the large title
                                                            </a>
                                                        </h3>
                                                        <p className="product-two-item-desc">
                                                            A long established fact that a reader will be distracted
                                                            by the readable content of a page when looking at its
                                                            layout. The point of using Lorem Ipsum is that it has a
                                                            more-or-less normal distribution of letters, as opposed...
                                                        </p>
                                                        <div className="product-two-item-price">
                                                            $19.00 <span className="price-old">$21.00</span>
                                                        </div>
                                                        <div className="product-two-item-review-icon">
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                        </div>
                                                        <div className="product-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-wishlist"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-WishlistModal"
                                                            >
                                                                <i className="icon-heart" />
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-cart"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CartAddModal"
                                                            >
                                                                <i className="icon-basket-loaded" />{" "}
                                                                <span>Add To Cart</span>
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-compare"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CompareModal"
                                                            >
                                                                <i className="icon-refresh" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        {/*== End Product Item ==*/}
                                        {/*== Start Product Item ==*/}
                                        <div className="product-two-item mb-4">
                                            <div className="row">
                                                <div className="col-lg-4 col-md-4">
                                                    <div className="product-two-item-thumb-wrap">
                                                        <a
                                                            className="product-two-item-thumb"
                                                            href="shop-single-product.html"
                                                        >
                                                            <img
                                                                src="assets/images/shop/7.jpg"
                                                                width={268}
                                                                height={313}
                                                                alt="Image-HasTech"
                                                            />
                                                        </a>
                                                        <div className="product-two-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-quick-view"
                                                                data-tooltip-text="Quick View"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-QuickViewModal"
                                                            >
                                                                <i className="icon-magnifier-add" />
                                                            </button>
                                                        </div>
                                                        <div className="countdown1" data-countdown="2025/01/05" />
                                                    </div>
                                                </div>
                                                <div className="col-lg-8 col-md-8 align-self-center">
                                                    <div className="product-two-item-info">
                                                        <h3 className="product-two-item-title mt-n1">
                                                            <a href="shop-single-product.html">4. Soldout product</a>
                                                        </h3>
                                                        <p className="product-two-item-desc">
                                                            At vero eos et accusamus et iusto odio dignissimos ducimus
                                                            qui blanditiis praesentium voluptatum deleniti atque
                                                            corrupti quos dolores et quas molestias excepturi sint
                                                            animi, id est laborum et dolorum fuga.
                                                        </p>
                                                        <div className="product-two-item-price">
                                                            $19.00 <span className="price-old">$21.00</span>
                                                        </div>
                                                        <div className="product-two-item-review-icon">
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                        </div>
                                                        <div className="product-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-wishlist"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-WishlistModal"
                                                            >
                                                                <i className="icon-heart" />
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-cart"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CartAddModal"
                                                            >
                                                                <i className="icon-basket-loaded" />{" "}
                                                                <span>Add To Cart</span>
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-compare"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CompareModal"
                                                            >
                                                                <i className="icon-refresh" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        {/*== End Product Item ==*/}
                                        {/*== Start Product Item ==*/}
                                        <div className="product-two-item mb-4">
                                            <div className="row">
                                                <div className="col-lg-4 col-md-4">
                                                    <div className="product-two-item-thumb-wrap">
                                                        <a
                                                            className="product-two-item-thumb"
                                                            href="shop-single-product.html"
                                                        >
                                                            <img
                                                                src="assets/images/shop/8.jpg"
                                                                width={268}
                                                                height={313}
                                                                alt="Image-HasTech"
                                                            />
                                                        </a>
                                                        <span className="label label-new">New</span>
                                                        <div className="product-two-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-quick-view"
                                                                data-tooltip-text="Quick View"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-QuickViewModal"
                                                            >
                                                                <i className="icon-magnifier-add" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div className="col-lg-8 col-md-8 align-self-center">
                                                    <div className="product-two-item-info">
                                                        <h3 className="product-two-item-title mt-n1">
                                                            <a href="shop-single-product.html">5. Simple product</a>
                                                        </h3>
                                                        <p className="product-two-item-desc">
                                                            On the other hand, we denounce with righteous indignation
                                                            and dislike men who are so beguiled and demoralized by the
                                                            charms of pleasure of the moment, so blinded by blame
                                                            belongs to those who fail in their duty through weakness
                                                            of will
                                                        </p>
                                                        <div className="product-two-item-price">$50.00</div>
                                                        <div className="product-two-item-review-icon">
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                            <img
                                                                src="assets/images/icons/star.svg"
                                                                width={19}
                                                                height={19}
                                                                alt="icon-star"
                                                            />
                                                        </div>
                                                        <div className="product-item-action">
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-wishlist"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-WishlistModal"
                                                            >
                                                                <i className="icon-heart" />
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-cart"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CartAddModal"
                                                            >
                                                                <i className="icon-basket-loaded" />{" "}
                                                                <span>Add To Cart</span>
                                                            </button>
                                                            <button
                                                                type="button"
                                                                className="product-action-btn action-btn-compare"
                                                                data-bs-toggle="modal"
                                                                data-bs-target="#action-CompareModal"
                                                            >
                                                                <i className="icon-refresh" />
                                                            </button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        {/*== End Product Item ==*/}
                                        <nav className="pagination-area pt-6">
                                            <ul className="page-numbers justify-content-center">
                                                <li>
                                                    <a className="page-number prev" href="shop.html">
                                                        <i className="icon-arrow-left" />
                                                    </a>
                                                </li>
                                                <li>
                                                    <a className="page-number active" href="shop.html">
                                                        1
                                                    </a>
                                                </li>
                                                <li>
                                                    <a className="page-number" href="shop.html">
                                                        2
                                                    </a>
                                                </li>
                                                <li>
                                                    <a className="page-number next" href="shop.html">
                                                        <i className="icon-arrow-right" />
                                                    </a>
                                                </li>
                                            </ul>
                                        </nav>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/*== End Product Area Wrapper ==*/}
                </main>

            </div>
        </>
    )
}

export default Shop;